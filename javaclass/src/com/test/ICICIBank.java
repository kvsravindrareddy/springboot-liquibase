package com.test;

public class ICICIBank implements RBI{

    @Override
    public Double rtgsTransactionLimit() {
        return 200000.00;
    }
}