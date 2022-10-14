package com.test2;

public class RunnableEx implements Runnable {

    @Override
    public void run() {
        System.out.println("...inside run method...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value(10, 20));
    }

    private synchronized Integer value(int a, int b) {
        System.out.println(Thread.currentThread().getName());
        int val = 10;
        return a + b;
    }

    public static void main(String[] args) {
        RunnableEx tx1 = new RunnableEx();
        Thread t1 = new Thread(tx1);
        t1.start();

        RunnableEx tx2 = new RunnableEx();
        Thread t2 = new Thread(tx1);
        t2.start();
    }
}