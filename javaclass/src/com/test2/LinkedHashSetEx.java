package com.test2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("Z");
        set.add("C");
        set.add("A");
        System.out.println(set);
    }
}
