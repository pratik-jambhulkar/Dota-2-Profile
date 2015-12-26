
package com.example.pratik.dota2profile.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Dota2 implements Serializable{

    @SerializedName("result")
    private Result_ result;

    /**
     * 
     * @return
     *     The result
     */
    public Result_ getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(Result_ result) {
        this.result = result;
    }

}
