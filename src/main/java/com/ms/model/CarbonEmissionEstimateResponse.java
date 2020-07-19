package com.ms.model;

public class CarbonEmissionEstimateResponse {

    private double emissionFactor;

    public CarbonEmissionEstimateResponse(double emissionFactor) {
        this.emissionFactor = emissionFactor;
    }

    public double getEmissionFactor() {
        return emissionFactor;
    }

}
