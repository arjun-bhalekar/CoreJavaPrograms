package com.core.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    public static CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);


        new MyThread().start();

        copyOnWriteArrayList.forEach(integer -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MainThread : " + integer);
            copyOnWriteArrayList.add(integer * 2);
        });

        System.out.println("After Iterating : " + copyOnWriteArrayList);

    }


}

class MyThread extends Thread {

    @Override
    public void run() {
        CopyOnWriteArrayListTest.copyOnWriteArrayList.forEach(integer -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread : " + integer);
            //CopyOnWriteArrayListTest.copyOnWriteArrayList.remove(integer);
            CopyOnWriteArrayListTest.copyOnWriteArrayList.add(integer + 100);
        });
    }
}

