package com.ms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "distance",
        "weight"
})
public class CarbonOffsetEstimateDistanceWeightRequest {

    @JsonProperty("distance")
    private Distance distance;

    @JsonProperty("weight")
    private Weight weight;

    @JsonProperty("distance")
    public Distance getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    @JsonProperty("weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

}
