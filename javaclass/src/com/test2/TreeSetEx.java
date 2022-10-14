package com.test2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> treetSet = new TreeSet<>();
        treetSet.add("A");
        treetSet.add("Z");
        treetSet.add("C");
        treetSet.add("A");
        System.out.println(treetSet);
    }
}