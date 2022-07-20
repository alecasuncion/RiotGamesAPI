
package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first",
    "kills"
})
public class Champion {

    @JsonProperty("first")
    private Boolean first;
    @JsonProperty("kills")
    private Integer kills;

    @JsonProperty("first")
    public Boolean getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(Boolean first) {
        this.first = first;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

}
