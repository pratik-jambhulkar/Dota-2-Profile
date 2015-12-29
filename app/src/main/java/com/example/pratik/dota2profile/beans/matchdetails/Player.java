
package com.example.pratik.dota2profile.beans.matchdetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {

    @SerializedName("account_id")
    private String accountId;
    @SerializedName("player_slot")
    private String playerSlot;
    @SerializedName("hero_id")
    private String heroId;
    @SerializedName("item_0")
    private String item0;
    @SerializedName("item_1")
    private String item1;
    @SerializedName("item_2")
    private String item2;
    @SerializedName("item_3")
    private String item3;
    @SerializedName("item_4")
    private String item4;
    @SerializedName("item_5")
    private String item5;
    @SerializedName("kills")
    private String kills;
    @SerializedName("deaths")
    private String deaths;
    @SerializedName("assists")
    private String assists;
    @SerializedName("leaver_status")
    private String leaverStatus;
    @SerializedName("gold")
    private String gold;
    @SerializedName("last_hits")
    private String lastHits;
    @SerializedName("denies")
    private String denies;
    @SerializedName("gold_per_min")
    private String goldPerMin;
    @SerializedName("xp_per_min")
    private String xpPerMin;
    @SerializedName("gold_spent")
    private String goldSpent;
    @SerializedName("hero_damage")
    private String heroDamage;
    @SerializedName("tower_damage")
    private String towerDamage;
    @SerializedName("hero_healing")
    private String heroHealing;
    @SerializedName("level")
    private String level;
    @SerializedName("ability_upgrades")
    private List<AbilityUpgrade> abilityUpgrades = new ArrayList<AbilityUpgrade>();

    /**
     * 
     * @return
     *     The accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The account_id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The playerSlot
     */
    public String getPlayerSlot() {
        return playerSlot;
    }

    /**
     * 
     * @param playerSlot
     *     The player_slot
     */
    public void setPlayerSlot(String playerSlot) {
        this.playerSlot = playerSlot;
    }

    /**
     * 
     * @return
     *     The heroId
     */
    public String getHeroId() {
        return heroId;
    }

    /**
     * 
     * @param heroId
     *     The hero_id
     */
    public void setHeroId(String heroId) {
        this.heroId = heroId;
    }

    /**
     * 
     * @return
     *     The item0
     */
    public String getItem0() {
        return item0;
    }

    /**
     * 
     * @param item0
     *     The item_0
     */
    public void setItem0(String item0) {
        this.item0 = item0;
    }

    /**
     * 
     * @return
     *     The item1
     */
    public String getItem1() {
        return item1;
    }

    /**
     * 
     * @param item1
     *     The item_1
     */
    public void setItem1(String item1) {
        this.item1 = item1;
    }

    /**
     * 
     * @return
     *     The item2
     */
    public String getItem2() {
        return item2;
    }

    /**
     * 
     * @param item2
     *     The item_2
     */
    public void setItem2(String item2) {
        this.item2 = item2;
    }

    /**
     * 
     * @return
     *     The item3
     */
    public String getItem3() {
        return item3;
    }

    /**
     * 
     * @param item3
     *     The item_3
     */
    public void setItem3(String item3) {
        this.item3 = item3;
    }

    /**
     * 
     * @return
     *     The item4
     */
    public String getItem4() {
        return item4;
    }

    /**
     * 
     * @param item4
     *     The item_4
     */
    public void setItem4(String item4) {
        this.item4 = item4;
    }

    /**
     * 
     * @return
     *     The item5
     */
    public String getItem5() {
        return item5;
    }

    /**
     * 
     * @param item5
     *     The item_5
     */
    public void setItem5(String item5) {
        this.item5 = item5;
    }

    /**
     * 
     * @return
     *     The kills
     */
    public String getKills() {
        return kills;
    }

    /**
     * 
     * @param kills
     *     The kills
     */
    public void setKills(String kills) {
        this.kills = kills;
    }

    /**
     * 
     * @return
     *     The deaths
     */
    public String getDeaths() {
        return deaths;
    }

    /**
     * 
     * @param deaths
     *     The deaths
     */
    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    /**
     * 
     * @return
     *     The assists
     */
    public String getAssists() {
        return assists;
    }

    /**
     * 
     * @param assists
     *     The assists
     */
    public void setAssists(String assists) {
        this.assists = assists;
    }

    /**
     * 
     * @return
     *     The leaverStatus
     */
    public String getLeaverStatus() {
        return leaverStatus;
    }

    /**
     * 
     * @param leaverStatus
     *     The leaver_status
     */
    public void setLeaverStatus(String leaverStatus) {
        this.leaverStatus = leaverStatus;
    }

    /**
     * 
     * @return
     *     The gold
     */
    public String getGold() {
        return gold;
    }

    /**
     * 
     * @param gold
     *     The gold
     */
    public void setGold(String gold) {
        this.gold = gold;
    }

    /**
     * 
     * @return
     *     The lastHits
     */
    public String getLastHits() {
        return lastHits;
    }

    /**
     * 
     * @param lastHits
     *     The last_hits
     */
    public void setLastHits(String lastHits) {
        this.lastHits = lastHits;
    }

    /**
     * 
     * @return
     *     The denies
     */
    public String getDenies() {
        return denies;
    }

    /**
     * 
     * @param denies
     *     The denies
     */
    public void setDenies(String denies) {
        this.denies = denies;
    }

    /**
     * 
     * @return
     *     The goldPerMin
     */
    public String getGoldPerMin() {
        return goldPerMin;
    }

    /**
     * 
     * @param goldPerMin
     *     The gold_per_min
     */
    public void setGoldPerMin(String goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    /**
     * 
     * @return
     *     The xpPerMin
     */
    public String getXpPerMin() {
        return xpPerMin;
    }

    /**
     * 
     * @param xpPerMin
     *     The xp_per_min
     */
    public void setXpPerMin(String xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    /**
     * 
     * @return
     *     The goldSpent
     */
    public String getGoldSpent() {
        return goldSpent;
    }

    /**
     * 
     * @param goldSpent
     *     The gold_spent
     */
    public void setGoldSpent(String goldSpent) {
        this.goldSpent = goldSpent;
    }

    /**
     * 
     * @return
     *     The heroDamage
     */
    public String getHeroDamage() {
        return heroDamage;
    }

    /**
     * 
     * @param heroDamage
     *     The hero_damage
     */
    public void setHeroDamage(String heroDamage) {
        this.heroDamage = heroDamage;
    }

    /**
     * 
     * @return
     *     The towerDamage
     */
    public String getTowerDamage() {
        return towerDamage;
    }

    /**
     * 
     * @param towerDamage
     *     The tower_damage
     */
    public void setTowerDamage(String towerDamage) {
        this.towerDamage = towerDamage;
    }

    /**
     * 
     * @return
     *     The heroHealing
     */
    public String getHeroHealing() {
        return heroHealing;
    }

    /**
     * 
     * @param heroHealing
     *     The hero_healing
     */
    public void setHeroHealing(String heroHealing) {
        this.heroHealing = heroHealing;
    }

    /**
     * 
     * @return
     *     The level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The abilityUpgrades
     */
    public List<AbilityUpgrade> getAbilityUpgrades() {
        return abilityUpgrades;
    }

    /**
     * 
     * @param abilityUpgrades
     *     The ability_upgrades
     */
    public void setAbilityUpgrades(List<AbilityUpgrade> abilityUpgrades) {
        this.abilityUpgrades = abilityUpgrades;
    }

}
