package com.test2;

import java.util.Optional;

public class ListEx {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("Z");
//        list.add("A");
//        list.add("C");
//        list.add("A");
//        list.add("Z");
//        list.add("A");
//        list.add("C");
//        list.add("A");
//        list.add("Z");
//        list.add("A");
//        list.add("C");
//
//        List<String> names = Arrays.asList("Ravi Kakarla", "Twinkle ab");
//
//        names.stream().filter(name->name.contains("Kakarla")).collect(Collectors.toList());
//        List<String> resultNames = new ArrayList<>();
//        for(String name : names) {
//            if(name.contains("Kakarla")) {
//                resultNames.add(name);
//            }
//        }
//
//        //list.stream().forEach(System.out::println);
//
//        List<String> anotherList = new ArrayList<>();
//        for (String str : list) {
//            if (str != "Z") {
//                anotherList.add(str);
//            }
//        }
//        System.out.println(anotherList);
//
//
//        List<String> resultList = list.stream().filter(str -> str != "Z").collect(Collectors.toList());
//
//        list.stream().forEach(System.out::println);
//
//    }
//
//    public static void testMethod(Integer input) {
//        System.out.println("test static "+input);
//
//        String str = getName();
//
//    }

    public static void main(String[] args) {
        //Ravindra Kakarla
        Optional<String> name = getName();
        name.ifPresent(System.out::println);
//        if(name.isPresent()) {
//            String nameresult = name.get();
//            System.out.println(nameresult.substring(nameresult.lastIndexOf(" ") + 1));
//        }

        System.out.println("ab".hashCode());
        System.out.println("cA".hashCode());
        //Store in DB
        //Call API ==> Executor framework or Java Reactive API/Library
    }

    public static Optional<String> getName() {
        return Optional.of("Ravindra");
    }
}