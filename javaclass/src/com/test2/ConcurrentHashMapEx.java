package com.test2;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A",1);
        map.put("Z",2);
        map.put("C",3);
        map.put("A",4);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            map.put("G",6);
            map.put("H",7);
        }
        map.put("L",9);
        System.out.println(map);

    }
}