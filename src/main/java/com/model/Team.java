
package com.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bans",
    "objectives",
    "teamId",
    "win"
})
public class Team {

    @JsonProperty("bans")
    private List<Object> bans = null;
    @JsonProperty("objectives")
    private Objectives objectives;
    @JsonProperty("teamId")
    private Integer teamId;
    @JsonProperty("win")
    private Boolean win;

    @JsonProperty("bans")
    public List<Object> getBans() {
        return bans;
    }

    @JsonProperty("bans")
    public void setBans(List<Object> bans) {
        this.bans = bans;
    }

    @JsonProperty("objectives")
    public Objectives getObjectives() {
        return objectives;
    }

    @JsonProperty("objectives")
    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    @JsonProperty("teamId")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("win")
    public Boolean getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Boolean win) {
        this.win = win;
    }

}
