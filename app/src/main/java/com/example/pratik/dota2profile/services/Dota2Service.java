package com.example.pratik.dota2profile.services;

import android.content.Context;

import com.example.pratik.dota2profile.beans.Dota2;
import com.example.pratik.dota2profile.beans.Heroes;
import com.example.pratik.dota2profile.beans.matchdetails.MatchDetails;
import com.example.pratik.dota2profile.interfaces.Dota2EventListener;
import com.example.pratik.dota2profile.interfaces.Dota2ServiceInterface;
import com.example.pratik.dota2profile.utils.Dota2ProfileConstants;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by pratik on 24-12-2015.
 */
public class Dota2Service {

    Context context;

    public Dota2Service(Context context){
        this.context = context;
    }

    public void getLastMatches(String accountID, final Dota2EventListener listener){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Dota2ProfileConstants.API).build();

        //create an adapter for retrofit with base url

        Dota2ServiceInterface dota2ServiceInterface = restAdapter.create(Dota2ServiceInterface.class);

        dota2ServiceInterface.getMatchDetailsForId(accountID,new Callback<Dota2>(){

            @Override
            public void success(Dota2 dota2, Response response) {
                listener.onSuccess(dota2);
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onError();
            }
        });

    }

    public void getHeroList(final Dota2EventListener listener){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Dota2ProfileConstants.API).build();

        //create an adapter for retrofit with base url

        Dota2ServiceInterface dota2ServiceInterface = restAdapter.create(Dota2ServiceInterface.class);

        dota2ServiceInterface.getHeroList(new Callback<Heroes>() {

            @Override
            public void success(Heroes heroes, Response response) {
                listener.onSuccess(heroes);
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onError();
            }
        });

    }

    public void getCompleteMatchDetails(String matchId, final Dota2EventListener listener){
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Dota2ProfileConstants.API).build();

        //create an adapter for retrofit with base url

        Dota2ServiceInterface dota2ServiceInterface = restAdapter.create(Dota2ServiceInterface.class);

        dota2ServiceInterface.getCompleteMatchDetails(matchId, new Callback<MatchDetails>() {

            @Override
            public void success(MatchDetails match, Response response) {
                listener.onSuccess(match);
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onError();
            }
        });

    }
}
