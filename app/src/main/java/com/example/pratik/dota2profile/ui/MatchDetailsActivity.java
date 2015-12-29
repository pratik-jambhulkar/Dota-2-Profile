package com.example.pratik.dota2profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pratik.dota2profile.R;
import com.example.pratik.dota2profile.beans.matchdetails.MatchDetails;
import com.example.pratik.dota2profile.beans.matchdetails.Player;
import com.example.pratik.dota2profile.interfaces.Dota2EventListener;
import com.example.pratik.dota2profile.services.Dota2Service;


public class MatchDetailsActivity extends Activity {

    private String accountId;
    private String matchId;
    private Dota2Service service;
    private MatchDetails matchDetails;
    private Boolean radiantWin, playerTeam = true;
    private String result = "lost";
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);

        resultTextView = (TextView) findViewById(R.id.resultTextView);

        Intent intent = getIntent();
        accountId = intent.getStringExtra("accountId");
        matchId = intent.getStringExtra("matchId");

        service = new Dota2Service(getApplicationContext());

        service.getCompleteMatchDetails(matchId, new Dota2EventListener() {
            @Override
            public void onSuccess(Object object) {
                matchDetails = (MatchDetails) object;

                radiantWin = matchDetails.getResult().getRadiantWin();
                int i = 0;
                for(Player player: matchDetails.getResult().getPlayers()){
                    if(player.getAccountId().equals(accountId)){
                        break;
                    }
                    i++;
                }

                if(i>4)
                    playerTeam = false;

                if( ( radiantWin && playerTeam ) || ( !radiantWin && !playerTeam)){
                    result = "won";
                } else {
                    result = "lost";
                }

                resultTextView.setText(result);
            }

            @Override
            public void onError() {

            }
        });


    }

}
