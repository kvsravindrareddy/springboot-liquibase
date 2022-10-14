package com.test2;

public class StringEx {
    public static void main(String[] args) {
        String input = "ABC";

        char[] chArr = {'R','a','v','i'};
        String str = new String(chArr);
        System.out.println(str);

        String str1 = "Ravi";
        String str2 = new String("Ravi");
        String str3 = "Ravi";
        String str4 = "Kakarla";
        String str5 = new String("Ravi");
        System.out.println(str1.getClass().hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.getClass().hashCode());
        System.out.println(str.getClass().getSuperclass().toString());

        if(str1==str5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(str1.equals(str2)) {
            System.out.println("str1 and str2 content is equal");
        } else {
            System.out.println("str1 and str2 contents are not equal");
        }
    }
}