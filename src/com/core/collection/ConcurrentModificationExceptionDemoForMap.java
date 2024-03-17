package com.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionDemoForMap extends Thread {

    //private static Map<Integer, String> map = new HashMap<>();
    private static Map<Integer, String> map = new ConcurrentHashMap<>();
    //Segment locking or bucket locking
    @Override
    public void run() {

        try {
            System.out.println("Child Thread modifying map");
            Thread.sleep(1000);
            map.put(104, "D");

        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");

        ConcurrentModificationExceptionDemoForMap demo = new ConcurrentModificationExceptionDemoForMap();
        demo.start();

        //main thread will iterate map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            try {
                System.out.println("Main Thread iterating map");
                Thread.sleep(1000);
                System.out.println(entry);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("===>" +map);
    }
}
