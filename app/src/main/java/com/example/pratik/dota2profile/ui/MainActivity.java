package com.example.pratik.dota2profile.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pratik.dota2profile.R;
import com.example.pratik.dota2profile.beans.Dota2;
import com.example.pratik.dota2profile.beans.Hero;
import com.example.pratik.dota2profile.beans.Heroes;
import com.example.pratik.dota2profile.beans.Match;
import com.example.pratik.dota2profile.beans.Player;
import com.example.pratik.dota2profile.interfaces.Dota2EventListener;
import com.example.pratik.dota2profile.services.Dota2Service;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity{

    private Dota2 dota2;
    private Heroes heroes;
    private Dota2Service service;
    private HashMap<Integer,String> heroesMap;
    private ArrayList<String> playedHeroes;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.heroesListView);

        heroesMap = new HashMap<Integer,String>();
        playedHeroes = new ArrayList<String>();
        service = new Dota2Service(getApplicationContext());

        Dota2EventListener heroListListerner = new Dota2EventListener() {
            @Override
            public void onSuccess(Object object) {
                if(null != object){
                    heroes = (Heroes) object;
                    for(Hero i : heroes.getResult().getHeroes()){
                        heroesMap.put(Integer.parseInt(i.getId()),i.getLocalizedName());
                        secondService();
                    }
                }
            }

            @Override
            public void onError() {

            }
        };

        service.getHeroList(heroListListerner);
//        A2A15A3C5FAB9E3DD4703352526BBFAF
//        https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?player_name=-=Steel=-&key=A2A15A3C5FAB9E3DD4703352526BBFAF
//        105368027 steel's id
//        https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?key=A2A15A3C5FAB9E3DD4703352526BBFAF&account_id=76561198065633755
//        https://api.steampowered.com/IEconDOTA2_570/GetHeroes/v0001/?key=A2A15A3C5FAB9E3DD4703352526BBFAF&language=en_us
    }

    private void secondService() {
        Dota2EventListener profilelistener = new Dota2EventListener() {
            @Override
            public void onSuccess(Object data) {
                if(null != data){
                    dota2 = (Dota2) data;
                    for(Match match: dota2.getResult().getMatches()){
                        for(Player player: match.getPlayers()){
                            if(player.getAccountId().equals("105368027")){
                                playedHeroes.add(heroesMap.get(Integer.parseInt(player.getHeroId())));
                            }
                        }
                    }
                    updateListView();
                }
            }

            @Override
            public void onError() {

            }
        };

        service.getLastMatches("105368027",profilelistener);
    }

    private void updateListView() {

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.my_text_view,playedHeroes);
        listView.setAdapter(arrayAdapter);
    }
}
