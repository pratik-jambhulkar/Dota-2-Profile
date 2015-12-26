
package com.example.pratik.dota2profile.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Player implements Serializable{

    @SerializedName("account_id")
    private String accountId;
    @SerializedName("player_slot")
    private String playerSlot;
    @SerializedName("hero_id")
    private String heroId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(String playerSlot) {
        this.playerSlot = playerSlot;
    }

    public String getHeroId() {
        return heroId;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId;
    }
}
