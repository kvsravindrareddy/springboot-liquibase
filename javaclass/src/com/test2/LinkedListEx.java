package com.test2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("Z");
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("Z");
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("Z");
        list.add("A");
        list.add("C");

        System.out.println("*********");
        for(String str : list) {
            System.out.println(str);
        }
        System.out.println("*********");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*********");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
