package org.example.model;

public class Account {
    private Person person;
    private int visaCard;
    private int accountNum;

    public Account() {
    }

    public Account(Person person, int visaCard, int accountNum) {
        this.person = person;
        this.visaCard = visaCard;
        this.accountNum = accountNum;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getVisaCard() {
        return visaCard;
    }

    public void setVisaCard(int visaCard) {
        this.visaCard = visaCard;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
}
