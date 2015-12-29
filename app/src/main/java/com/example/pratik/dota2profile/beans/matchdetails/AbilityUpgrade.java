
package com.example.pratik.dota2profile.beans.matchdetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AbilityUpgrade implements Serializable{

    @SerializedName("ability")
    private String ability;
    @SerializedName("time")
    private String time;
    @SerializedName("level")
    private String level;

    /**
     * 
     * @return
     *     The ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * 
     * @param ability
     *     The ability
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    /**
     * 
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
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

}
