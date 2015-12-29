
package com.example.pratik.dota2profile.beans.matchdetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Result implements Serializable{

    @SerializedName("players")
    private List<com.example.pratik.dota2profile.beans.matchdetails.Player> players = new ArrayList<>();
    @SerializedName("radiant_win")
    private Boolean radiantWin;
    @SerializedName("duration")
    private String duration;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("match_id")
    private String matchId;
    @SerializedName("match_seq_num")
    private String matchSeqNum;
    @SerializedName("tower_status_radiant")
    private String towerStatusRadiant;
    @SerializedName("tower_status_dire")
    private String towerStatusDire;
    @SerializedName("barracks_status_radiant")
    private String barracksStatusRadiant;
    @SerializedName("barracks_status_dire")
    private String barracksStatusDire;
    @SerializedName("cluster")
    private String cluster;
    @SerializedName("first_blood_time")
    private String firstBloodTime;
    @SerializedName("lobby_type")
    private String lobbyType;
    @SerializedName("human_players")
    private String humanPlayers;
    @SerializedName("leagueid")
    private String leagueid;
    @SerializedName("positive_votes")
    private String positiveVotes;
    @SerializedName("negative_votes")
    private String negativeVotes;
    @SerializedName("game_mode")
    private String gameMode;
    @SerializedName("engine")
    private String engine;

    /**
     * 
     * @return
     *     The players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * @param players
     *     The players
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * 
     * @return
     *     The radiantWin
     */
    public Boolean getRadiantWin() {
        return radiantWin;
    }

    /**
     * 
     * @param radiantWin
     *     The radiant_win
     */
    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The start_time
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     *     The matchId
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * 
     * @param matchId
     *     The match_id
     */
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * 
     * @return
     *     The matchSeqNum
     */
    public String getMatchSeqNum() {
        return matchSeqNum;
    }

    /**
     * 
     * @param matchSeqNum
     *     The match_seq_num
     */
    public void setMatchSeqNum(String matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    /**
     * 
     * @return
     *     The towerStatusRadiant
     */
    public String getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    /**
     * 
     * @param towerStatusRadiant
     *     The tower_status_radiant
     */
    public void setTowerStatusRadiant(String towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    /**
     * 
     * @return
     *     The towerStatusDire
     */
    public String getTowerStatusDire() {
        return towerStatusDire;
    }

    /**
     * 
     * @param towerStatusDire
     *     The tower_status_dire
     */
    public void setTowerStatusDire(String towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    /**
     * 
     * @return
     *     The barracksStatusRadiant
     */
    public String getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    /**
     * 
     * @param barracksStatusRadiant
     *     The barracks_status_radiant
     */
    public void setBarracksStatusRadiant(String barracksStatusRadiant) {
        this.barracksStatusRadiant = barracksStatusRadiant;
    }

    /**
     * 
     * @return
     *     The barracksStatusDire
     */
    public String getBarracksStatusDire() {
        return barracksStatusDire;
    }

    /**
     * 
     * @param barracksStatusDire
     *     The barracks_status_dire
     */
    public void setBarracksStatusDire(String barracksStatusDire) {
        this.barracksStatusDire = barracksStatusDire;
    }

    /**
     * 
     * @return
     *     The cluster
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * 
     * @param cluster
     *     The cluster
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * 
     * @return
     *     The firstBloodTime
     */
    public String getFirstBloodTime() {
        return firstBloodTime;
    }

    /**
     * 
     * @param firstBloodTime
     *     The first_blood_time
     */
    public void setFirstBloodTime(String firstBloodTime) {
        this.firstBloodTime = firstBloodTime;
    }

    /**
     * 
     * @return
     *     The lobbyType
     */
    public String getLobbyType() {
        return lobbyType;
    }

    /**
     * 
     * @param lobbyType
     *     The lobby_type
     */
    public void setLobbyType(String lobbyType) {
        this.lobbyType = lobbyType;
    }

    /**
     * 
     * @return
     *     The humanPlayers
     */
    public String getHumanPlayers() {
        return humanPlayers;
    }

    /**
     * 
     * @param humanPlayers
     *     The human_players
     */
    public void setHumanPlayers(String humanPlayers) {
        this.humanPlayers = humanPlayers;
    }

    /**
     * 
     * @return
     *     The leagueid
     */
    public String getLeagueid() {
        return leagueid;
    }

    /**
     * 
     * @param leagueid
     *     The leagueid
     */
    public void setLeagueid(String leagueid) {
        this.leagueid = leagueid;
    }

    /**
     * 
     * @return
     *     The positiveVotes
     */
    public String getPositiveVotes() {
        return positiveVotes;
    }

    /**
     * 
     * @param positiveVotes
     *     The positive_votes
     */
    public void setPositiveVotes(String positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

    /**
     * 
     * @return
     *     The negativeVotes
     */
    public String getNegativeVotes() {
        return negativeVotes;
    }

    /**
     * 
     * @param negativeVotes
     *     The negative_votes
     */
    public void setNegativeVotes(String negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

    /**
     * 
     * @return
     *     The gameMode
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * 
     * @param gameMode
     *     The game_mode
     */
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    /**
     * 
     * @return
     *     The engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * 
     * @param engine
     *     The engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

}
