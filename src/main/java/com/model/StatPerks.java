
package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defense",
    "flex",
    "offense"
})
public class StatPerks {

    @JsonProperty("defense")
    private Integer defense;
    @JsonProperty("flex")
    private Integer flex;
    @JsonProperty("offense")
    private Integer offense;

    @JsonProperty("defense")
    public Integer getDefense() {
        return defense;
    }

    @JsonProperty("defense")
    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @JsonProperty("flex")
    public Integer getFlex() {
        return flex;
    }

    @JsonProperty("flex")
    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    @JsonProperty("offense")
    public Integer getOffense() {
        return offense;
    }

    @JsonProperty("offense")
    public void setOffense(Integer offense) {
        this.offense = offense;
    }

}
