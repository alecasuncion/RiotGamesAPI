package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChampionMastery {
    @JsonProperty
    private String championId;

    @JsonProperty
    private String championLevel;
    @JsonProperty
    private String championPoints;
    @JsonProperty
    private String lastPlayTime;
    @JsonProperty
    private String championPointsSinceLastLevel;
    @JsonProperty
    private String championPointsUntilNextLevel;
    @JsonProperty
    private String chestGranted;
    @JsonProperty
    private String tokensEarned;
    @JsonProperty
    private String summonerId;

    public String getChampionId() {
        return championId;
    }

    public void setChampionId(String championId) {
        this.championId = championId;
    }

    public String getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(String championLevel) {
        this.championLevel = championLevel;
    }

    public String getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(String championPoints) {
        this.championPoints = championPoints;
    }

    public String getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(String lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public String getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(String championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public String getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(String championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public String getChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(String chestGranted) {
        this.chestGranted = chestGranted;
    }

    public String getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(String tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }


}
