package com.test;

public class RBIAbstractMain {
    public static void main(String[] args) {
        RBIAbstract icici = new ICICIAbstractImpl();
        Double iciciLimit = icici.rtgsTransactionLimit();
        icici.imps();
        System.out.println(iciciLimit);

        RBIAbstract sbi = new SBIAbstractImpl();
        Double sbiLimit = sbi.rtgsTransactionLimit();
        sbi.imps();
        System.out.println(sbiLimit);
    }
}
