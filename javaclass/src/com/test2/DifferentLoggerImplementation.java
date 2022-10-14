package com.test2;

import com.test.BaseLogger;

public class DifferentLoggerImplementation extends BaseLogger {
    public static void main(String[] args) {
        DifferentLoggerImplementation obj = new DifferentLoggerImplementation();
        obj.protectedMethod();
        BaseLogger baseLogger = new BaseLogger();
    }
}