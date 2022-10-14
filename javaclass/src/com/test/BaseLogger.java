package com.test;

public class BaseLogger {
    public void debug(String spanId, String traceId, String msg) {
        display();
        System.out.println("Log span id : "+spanId+" -- Trace Id : "+traceId+" -- msg : "+msg);
    }

    private void display() {
        System.out.println("....displaying.....");
    }

    void defaultMethod() {
        System.out.println("....This is the default method.....");
    }

    protected void protectedMethod() {
        System.out.println("....This is the default method.....");
    }
}