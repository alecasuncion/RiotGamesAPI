package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchId {

    @JsonProperty
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
