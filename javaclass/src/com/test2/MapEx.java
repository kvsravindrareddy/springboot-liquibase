package com.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("Z",2);
        map.put("C",3);
        map.put("A",4);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            if(!entry.getKey().equals("Z")) {
                //map.put("G",6);
                System.out.println(entry.getKey() + "--" + entry.getValue());
            }
        }
    }
}