package com.test2;

public class RunnableExJava8 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread class");
                FileEx fileEx = new FileEx();
            }
        };

        runnable.run();

        Runnable r = () -> {
            System.out.println("Thread class with Java8");
        };
        r.run();
    }
}