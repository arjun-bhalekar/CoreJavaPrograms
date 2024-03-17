package com.core.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

    public static void main(String[] args) {

        failSafeListDemo();
        failSafeMapDemo();
    }

    private static void failSafeListDemo() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("R");
        list.add("J");

        list.forEach(element -> {
            System.out.println(element);
            list.remove(element);
            list.add(element+"_changed"); //Exception in thread "main" java.util.ConcurrentModificationException
        });

        System.out.println(list);
    }


    private static void failSafeMapDemo() {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(100, "A");
        map.put(200, "C");

        map.forEach( (k, v) -> {
            System.out.println(k + "-" +v);
            map.put(400, "D"); //ConcurrentModificationException
        });

        System.out.println(map);
    }


}
