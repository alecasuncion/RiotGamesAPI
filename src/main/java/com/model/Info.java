
package com.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gameCreation",
    "gameDuration",
    "gameEndTimestamp",
    "gameId",
    "gameMode",
    "gameName",
    "gameStartTimestamp",
    "gameType",
    "gameVersion",
    "mapId",
    "participants",
    "platformId",
    "queueId",
    "teams",
    "tournamentCode"
})
public class Info {

    @JsonProperty("gameCreation")
    private Long gameCreation;
    @JsonProperty("gameDuration")
    private Integer gameDuration;
    @JsonProperty("gameEndTimestamp")
    private Long gameEndTimestamp;
    @JsonProperty("gameId")
    private Integer gameId;
    @JsonProperty("gameMode")
    private String gameMode;
    @JsonProperty("gameName")
    private String gameName;
    @JsonProperty("gameStartTimestamp")
    private Long gameStartTimestamp;
    @JsonProperty("gameType")
    private String gameType;
    @JsonProperty("gameVersion")
    private String gameVersion;
    @JsonProperty("mapId")
    private Integer mapId;
    @JsonProperty("participants")
    private List<Participant> participants = null;
    @JsonProperty("platformId")
    private String platformId;
    @JsonProperty("queueId")
    private Integer queueId;
    @JsonProperty("teams")
    private List<Team> teams = null;
    @JsonProperty("tournamentCode")
    private String tournamentCode;

    @JsonProperty("gameCreation")
    public Long getGameCreation() {
        return gameCreation;
    }

    @JsonProperty("gameCreation")
    public void setGameCreation(Long gameCreation) {
        this.gameCreation = gameCreation;
    }

    @JsonProperty("gameDuration")
    public Integer getGameDuration() {
        return gameDuration;
    }

    @JsonProperty("gameDuration")
    public void setGameDuration(Integer gameDuration) {
        this.gameDuration = gameDuration;
    }

    @JsonProperty("gameEndTimestamp")
    public Long getGameEndTimestamp() {
        return gameEndTimestamp;
    }

    @JsonProperty("gameEndTimestamp")
    public void setGameEndTimestamp(Long gameEndTimestamp) {
        this.gameEndTimestamp = gameEndTimestamp;
    }

    @JsonProperty("gameId")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("gameMode")
    public String getGameMode() {
        return gameMode;
    }

    @JsonProperty("gameMode")
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    @JsonProperty("gameName")
    public String getGameName() {
        return gameName;
    }

    @JsonProperty("gameName")
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @JsonProperty("gameStartTimestamp")
    public Long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    @JsonProperty("gameStartTimestamp")
    public void setGameStartTimestamp(Long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
    }

    @JsonProperty("gameType")
    public String getGameType() {
        return gameType;
    }

    @JsonProperty("gameType")
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @JsonProperty("gameVersion")
    public String getGameVersion() {
        return gameVersion;
    }

    @JsonProperty("gameVersion")
    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    @JsonProperty("mapId")
    public Integer getMapId() {
        return mapId;
    }

    @JsonProperty("mapId")
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @JsonProperty("platformId")
    public String getPlatformId() {
        return platformId;
    }

    @JsonProperty("platformId")
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    @JsonProperty("queueId")
    public Integer getQueueId() {
        return queueId;
    }

    @JsonProperty("queueId")
    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @JsonProperty("tournamentCode")
    public String getTournamentCode() {
        return tournamentCode;
    }

    @JsonProperty("tournamentCode")
    public void setTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
    }

}
