
package com.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "selections",
    "style"
})
public class Style {

    @JsonProperty("description")
    private String description;
    @JsonProperty("selections")
    private List<Selection> selections = null;
    @JsonProperty("style")
    private Integer style;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("selections")
    public List<Selection> getSelections() {
        return selections;
    }

    @JsonProperty("selections")
    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    @JsonProperty("style")
    public Integer getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Integer style) {
        this.style = style;
    }

}
