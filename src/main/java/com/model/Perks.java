
package com.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statPerks",
    "styles"
})
public class Perks {

    @JsonProperty("statPerks")
    private StatPerks statPerks;
    @JsonProperty("styles")
    private List<Style> styles = null;

    @JsonProperty("statPerks")
    public StatPerks getStatPerks() {
        return statPerks;
    }

    @JsonProperty("statPerks")
    public void setStatPerks(StatPerks statPerks) {
        this.statPerks = statPerks;
    }

    @JsonProperty("styles")
    public List<Style> getStyles() {
        return styles;
    }

    @JsonProperty("styles")
    public void setStyles(List<Style> styles) {
        this.styles = styles;
    }

}
