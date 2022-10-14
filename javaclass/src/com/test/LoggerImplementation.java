package com.test;

public class LoggerImplementation extends BaseLogger {

    public void debug(String spanId, String traceId, String msg, String appName) {
        System.out.println("Application name : "+appName+" -- Log span id : "+spanId+" -- Trace Id : "+traceId+" -- msg : "+msg);
    }

    public void debug(String spanId, String traceId, String msg) {
        System.out.println(" -- Trace Id : "+traceId+" -- Log span id : "+spanId+" -- msg : "+msg);
    }

    public static void main(String[] args) {
        LoggerImplementation childLogger = new LoggerImplementation();
        childLogger.debug("123","234","Application is failed to Run");
        childLogger.debug("123","234","Application is failed to Run","test-app");
        childLogger.defaultMethod();
    }
}