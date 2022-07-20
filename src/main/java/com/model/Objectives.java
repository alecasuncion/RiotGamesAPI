
package com.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baron",
    "champion",
    "dragon",
    "inhibitor",
    "riftHerald",
    "tower"
})
public class Objectives {

    @JsonProperty("baron")
    private Baron baron;
    @JsonProperty("champion")
    private Champion champion;
    @JsonProperty("dragon")
    private Dragon dragon;
    @JsonProperty("inhibitor")
    private Inhibitor inhibitor;
    @JsonProperty("riftHerald")
    private RiftHerald riftHerald;
    @JsonProperty("tower")
    private Tower tower;

    @JsonProperty("baron")
    public Baron getBaron() {
        return baron;
    }

    @JsonProperty("baron")
    public void setBaron(Baron baron) {
        this.baron = baron;
    }

    @JsonProperty("champion")
    public Champion getChampion() {
        return champion;
    }

    @JsonProperty("champion")
    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    @JsonProperty("dragon")
    public Dragon getDragon() {
        return dragon;
    }

    @JsonProperty("dragon")
    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    @JsonProperty("inhibitor")
    public Inhibitor getInhibitor() {
        return inhibitor;
    }

    @JsonProperty("inhibitor")
    public void setInhibitor(Inhibitor inhibitor) {
        this.inhibitor = inhibitor;
    }

    @JsonProperty("riftHerald")
    public RiftHerald getRiftHerald() {
        return riftHerald;
    }

    @JsonProperty("riftHerald")
    public void setRiftHerald(RiftHerald riftHerald) {
        this.riftHerald = riftHerald;
    }

    @JsonProperty("tower")
    public Tower getTower() {
        return tower;
    }

    @JsonProperty("tower")
    public void setTower(Tower tower) {
        this.tower = tower;
    }

}
