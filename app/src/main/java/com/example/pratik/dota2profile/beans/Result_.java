
package com.example.pratik.dota2profile.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Result_ implements Serializable{

    @SerializedName("status")
    private String status;
    @SerializedName("num_results")
    private String numResults;
    @SerializedName("total_results")
    private String totalResults;
    @SerializedName("results_remaining")
    private String resultsRemaining;
    @SerializedName("matches")
    private List<Match> matches = new ArrayList<Match>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumResults() {
        return numResults;
    }

    public void setNumResults(String numResults) {
        this.numResults = numResults;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResultsRemaining() {
        return resultsRemaining;
    }

    public void setResultsRemaining(String resultsRemaining) {
        this.resultsRemaining = resultsRemaining;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
