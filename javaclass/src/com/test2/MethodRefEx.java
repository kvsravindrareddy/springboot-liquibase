package com.test2;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        //list.stream().forEach(ListEx::testMethod);
    }
}