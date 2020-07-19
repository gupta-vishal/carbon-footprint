package com.ms.service.external.cloverly.response;

public class Cost {
    private String currency;
    private String total;
    private String transaction;
    private String offset;


    // Getter Methods

    public String getCurrency() {
        return currency;
    }

    public String getTotal() {
        return total;
    }

    public String getTransaction() {
        return transaction;
    }

    public String getOffset() {
        return offset;
    }

    // Setter Methods

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}