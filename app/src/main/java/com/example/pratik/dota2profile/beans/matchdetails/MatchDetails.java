
package com.example.pratik.dota2profile.beans.matchdetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MatchDetails implements Serializable{

    @SerializedName("result")
    private Result result;

    /**
     * 
     * @return
     *     The result
     */
    public Result getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(Result result) {
        this.result = result;
    }

}
