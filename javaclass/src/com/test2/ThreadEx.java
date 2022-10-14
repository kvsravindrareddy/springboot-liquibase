package com.test2;

public class ThreadEx extends Thread {
    @Override
    public void run() {
        System.out.println("...inside run method...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value(10,20));
    }

    private synchronized Integer value(int a, int b) {
        System.out.println(Thread.currentThread().getName());
        return a+b;
    }

    public static void main(String[] args)  {
        ThreadEx tx = new ThreadEx();
        tx.start();

        ThreadEx tx2 = new ThreadEx();
        tx2.start();
    }
}