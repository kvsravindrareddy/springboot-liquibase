package com.test;

public class AccountDetails {
    private String number;
    private String name;
    private String address;

    public AccountDetails(String number, String name, String address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}