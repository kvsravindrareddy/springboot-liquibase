package com.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class FileEx {
    private static void handleFile() {
        int value = 0;
        int mul = 0;
        try {
            mul = 10 / value;
        } catch (ArithmeticException ae) {
            System.out.println("Exception occured : "+ae.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println(mul);

        File file = new File("/Users/veera/s3fileupload.py");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } finally {
            try {
                is.close();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("finally");
        }
        System.out.println(".....after throwing");
    }

    public static void main(String[] args) {
//        handleFile();
//
//        String str = "";
//        if(str.equals("")) {
//            throw new InvalidDataException("String is empty");
//        }

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("A",1);
        Set<Map.Entry<String, Integer>> entrySet= table.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            table.put("B",2);
        }

    }
}