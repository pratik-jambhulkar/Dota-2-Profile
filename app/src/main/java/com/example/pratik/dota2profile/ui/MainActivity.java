package com.example.pratik.dota2profile.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.pratik.dota2profile.R;
import com.example.pratik.dota2profile.adapters.SimpleListAdapter;
import com.example.pratik.dota2profile.beans.Dota2;
import com.example.pratik.dota2profile.beans.Hero;
import com.example.pratik.dota2profile.beans.Heroes;
import com.example.pratik.dota2profile.beans.Match;
import com.example.pratik.dota2profile.beans.Player;
import com.example.pratik.dota2profile.interfaces.Dota2EventListener;
import com.example.pratik.dota2profile.services.Dota2Service;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Dota2 dota2;
    private Heroes heroes;
    private Dota2Service service;
    private HashMap<Integer, String> heroesMap;
    private HashMap<String, Integer> playerIdMap;
    private ArrayList<String> playedHeroes;
    private ListView listView;
    private boolean isVisible = false;
    private Spinner playerNamesSpinner;
    private String[] playerIdList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.heroesListView);
        playerIdMap = new HashMap<>();

        playerIdMap.put("-=Steel=-",105368027);
        playerIdMap.put("XyS",114412913);
        playerIdMap.put("Kakya",134299799);
        playerIdMap.put("Hodor",110667689);

        playerIdList = getApplicationContext().getResources().getStringArray(R.array.player_names);

        playerNamesSpinner = (Spinner) findViewById(R.id.playerNames);

        playerNamesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                isVisible = false;
                secondService(playerIdMap.get(playerIdList[i]).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        heroesMap = new HashMap<>();
        playedHeroes = new ArrayList<>();
        service = new Dota2Service(getApplicationContext());

        Dota2EventListener heroListListerner = new Dota2EventListener() {
            @Override
            public void onSuccess(Object object) {
                if (null != object) {
                    heroes = (Heroes) object;
                    for (Hero i : heroes.getResult().getHeroes()) {
                        heroesMap.put(Integer.parseInt(i.getId()), i.getLocalizedName());
//                        secondService();
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
//        XyS 76561198074678641/ 114412913
//        Kakya 76561198094565527/ 134299799
//        Vinay 110667689
//        https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/?match_id=2034637172&key=A2A15A3C5FAB9E3DD4703352526BBFAF
    }

    private void secondService(final String accountId) {
        Dota2EventListener profilelistener = new Dota2EventListener() {
            @Override
            public void onSuccess(Object data) {
                if (null != data) {
                    dota2 = (Dota2) data;
                    playedHeroes.clear();
                    for (Match match : dota2.getResult().getMatches()) {
                        for (Player player : match.getPlayers()) {
                            if (player.getAccountId().equals(accountId)) {
                                playedHeroes.add(heroesMap.get(Integer.parseInt(player.getHeroId())));
                            }
                        }
                    }
                    if (!isVisible)
                        updateListView();
                }
            }

            @Override
            public void onError() {

            }
        };

        service.getLastMatches(accountId, profilelistener);
    }

    private void updateListView() {
        isVisible = true;
        SimpleListAdapter arrayAdapter = new SimpleListAdapter(this, playedHeroes);
        listView.setAdapter(arrayAdapter);
    }
}
