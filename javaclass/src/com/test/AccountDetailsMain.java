package com.test;

public class AccountDetailsMain {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails("123","Ravi","Mallampet");
//        accountDetails.setNumber("123");
//        accountDetails.setName("Ravi");
//        accountDetails.setAddress("Mallampet");
        System.out.println("Account Number : "+accountDetails.getNumber());
        System.out.println("Accountholder name : "+accountDetails.getName());
        System.out.println("Address : "+accountDetails.getAddress());
    }
}