package com.test2;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();
        table.put("A",1);
        table.put("Z",2);
        table.put("C",3);
        table.put("A",4);
        System.out.println(table);
    }
}