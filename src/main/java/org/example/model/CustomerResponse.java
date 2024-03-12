package org.example.model;

import java.time.LocalTime;

public class CustomerResponse {
    private Status status;
    private double amount;
    private LocalTime time;

    public enum Status{
        FAIL, SUCCESS, PROCESSING
    }

    public CustomerResponse() {
    }

    public CustomerResponse(Status status, LocalTime time) {
        this.status = status;
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(CustomerRequest customerRequest) {
        this.amount = customerRequest.getAmount();
    }

    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }


//    public void setAmountFromRequest(CustomerRequest customerRequest) {
//        this.amount = customerRequest.getAmount();
//    }

}
