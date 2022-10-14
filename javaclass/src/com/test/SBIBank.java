package com.test;

public class SBIBank implements RBI {
    @Override
    public Double rtgsTransactionLimit() {
        return 100000.00;
    }
}