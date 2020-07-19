package com.ms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "weight"
})
public class CarbonOffsetEstimateWeightRequest {

    @JsonProperty("weight")
    private Weight weight;

    @JsonProperty("weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

}
