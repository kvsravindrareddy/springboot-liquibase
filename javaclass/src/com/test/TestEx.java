package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEx {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "apple", "orange", "orange", "orange", "orange", "papaya", "banana");
        Map<String, Long> itemsMap = items.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
        itemsMap.entrySet().stream().sorted((v1,v2)->v2.getValue().compareTo(v1.getValue())).forEach(System.out::println);
     //   System.out.println(itemsMap);
    }

}
