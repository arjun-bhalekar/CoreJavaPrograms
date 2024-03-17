package com.core.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailFastIterator {

    public static void main(String[] args) {

        //failFastListDemo();
        failFastMapDemo();
    }

    private static void failFastMapDemo() {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "A");
        map.put(200, "C");

        map.forEach( (k, v) -> {
            System.out.println(k + "-" +v);
            map.put(400, "D"); //ConcurrentModificationException
        });
    }

    private static void failFastListDemo() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("R");
        list.add("J");

        list.forEach(element -> {
            System.out.println(element);
            list.add(element+"_changed"); //Exception in thread "main" java.util.ConcurrentModificationException
        });
    }
}
