package org.example.model;

public class CustomerRequest {
    private static String serviceName="Booking System";
    private double amount;
    private Account account;

    public CustomerRequest() {
    }

    public CustomerRequest(double amount, Account account) {
        this.amount = amount;
        this.account=account;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
