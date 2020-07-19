package com.ms.model;

public class CarbonOffsetEstimateResponse {
    private String currency;
    private String offset;

    public String getCurrency() {
        return currency;
    }

    public String getOffset() {
        return offset;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
