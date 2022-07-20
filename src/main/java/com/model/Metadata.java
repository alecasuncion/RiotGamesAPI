
package com.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataVersion",
    "matchId",
    "participants"
})
public class Metadata {

    @JsonProperty("dataVersion")
    private String dataVersion;
    @JsonProperty("matchId")
    private String matchId;
    @JsonProperty("participants")
    private List<String> participants = null;

    @JsonProperty("dataVersion")
    public String getDataVersion() {
        return dataVersion;
    }

    @JsonProperty("dataVersion")
    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    @JsonProperty("matchId")
    public String getMatchId() {
        return matchId;
    }

    @JsonProperty("matchId")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("participants")
    public List<String> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

}
