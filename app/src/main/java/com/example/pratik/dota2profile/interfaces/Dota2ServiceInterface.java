package com.example.pratik.dota2profile.interfaces;

import com.example.pratik.dota2profile.beans.Dota2;
import com.example.pratik.dota2profile.beans.Heroes;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by pratik on 24-12-2015.
 */
public interface Dota2ServiceInterface {

    @GET("/IDOTA2Match_570/GetMatchHistory/V001/?key=A2A15A3C5FAB9E3DD4703352526BBFAF")
    public void getMatchDetailsForId(@Query("account_id") String accountId, Callback<Dota2> response);

    @GET("/IEconDOTA2_570/GetHeroes/v0001/?key=A2A15A3C5FAB9E3DD4703352526BBFAF&language=en_us")
    public void getHeroList(Callback<Heroes> response);


}
