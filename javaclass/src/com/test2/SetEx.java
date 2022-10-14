package com.test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("Z");
        set.add("A");
        set.add("C");

        System.out.println("***Foreach***");
        for(String str : set) {
            System.out.println(str);
        }

        System.out.println("***Iterator***");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String value = itr.next();
            System.out.println(value);
        }

        set.remove("A");
        System.out.println(set);
    }
}