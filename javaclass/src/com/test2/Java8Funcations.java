package com.test2;

import java.util.function.BiFunction;

public class Java8Funcations {
    public static void main(String[] args) {
        String str = "Ravi";
        //Function<String, Integer> function = s->s.contains("R");
        BiFunction<Integer, Integer, Integer> function = (a,b)->{
            Integer c=null;
            if(a!=null && b!=null) {
                c=a+b;
            }
            return c;
        };
        Integer result = function.apply(10,20);
        System.out.println(result);
    }

    private static Integer lengthOftheString(String input) {
        return input.length();
    }
}
