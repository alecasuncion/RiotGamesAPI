
package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "perk",
    "var1",
    "var2",
    "var3"
})
public class Selection {

    @JsonProperty("perk")
    private Integer perk;
    @JsonProperty("var1")
    private Integer var1;
    @JsonProperty("var2")
    private Integer var2;
    @JsonProperty("var3")
    private Integer var3;

    @JsonProperty("perk")
    public Integer getPerk() {
        return perk;
    }

    @JsonProperty("perk")
    public void setPerk(Integer perk) {
        this.perk = perk;
    }

    @JsonProperty("var1")
    public Integer getVar1() {
        return var1;
    }

    @JsonProperty("var1")
    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    @JsonProperty("var2")
    public Integer getVar2() {
        return var2;
    }

    @JsonProperty("var2")
    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    @JsonProperty("var3")
    public Integer getVar3() {
        return var3;
    }

    @JsonProperty("var3")
    public void setVar3(Integer var3) {
        this.var3 = var3;
    }

}
