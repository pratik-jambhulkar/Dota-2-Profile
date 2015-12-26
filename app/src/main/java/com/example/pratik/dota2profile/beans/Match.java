
package com.example.pratik.dota2profile.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Match implements Serializable{

    @SerializedName("match_id")
    private String matchId;
    @SerializedName("match_seq_num")
    private String matchSeqNum;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("lobby_type")
    private String lobbyType;
    @SerializedName("radiant_team_id")
    private String radiantTeamId;
    @SerializedName("dire_team_id")
    private String direTeamId;
    @SerializedName("players")
    private List<Player> players = new ArrayList<Player>();

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchSeqNum() {
        return matchSeqNum;
    }

    public void setMatchSeqNum(String matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(String lobbyType) {
        this.lobbyType = lobbyType;
    }

    public String getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(String radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    public String getDireTeamId() {
        return direTeamId;
    }

    public void setDireTeamId(String direTeamId) {
        this.direTeamId = direTeamId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
