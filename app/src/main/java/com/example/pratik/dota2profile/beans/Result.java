
package com.example.pratik.dota2profile.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Result implements Serializable{

    @SerializedName("heroes")
    private List<Hero> heroes = new ArrayList<Hero>();
    @SerializedName("status")
    private String status;
    @SerializedName("count")
    private String count;

    /**
     * 
     * @return
     *     The heroes
     */
    public List<Hero> getHeroes() {
        return heroes;
    }

    /**
     * 
     * @param heroes
     *     The heroes
     */
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The count
     */
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(String count) {
        this.count = count;
    }

}
