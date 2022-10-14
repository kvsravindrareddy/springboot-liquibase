package com.test;

public class RBITest {
    public static void main(String[] args) {
        RBI iciciBank = new ICICIBank();
        Double iciciRtgsLimit = iciciBank.rtgsTransactionLimit();
        System.out.println(iciciRtgsLimit);

        RBI sbiBank = new SBIBank();
        Double sbiRtgsLimit = sbiBank.rtgsTransactionLimit();
        System.out.println(sbiRtgsLimit);
    }
}