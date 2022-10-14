package com.test3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1","2","3");
        List<String> list2 = Arrays.asList("4","5","6");
        List<List<String>> reList = Arrays.asList(list1,list2);
        List<String> finList = reList.stream().flatMap(val->val.stream()).collect(Collectors.toList());
        System.out.println(finList);
    }
}
