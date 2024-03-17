package com.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NullKeyValueTest {

    public static void main(String[] args) {

        //System.out.println(34 % 10);

        Map<Integer, String> map = new HashMap<>();

        map.put(100, null); //allowed
        map.put(200, null); //allowed
        map.put(null, "empty"); //allowed
        String previousValue = map.put(null, null); //allowed
        System.out.println("previousVal :" + previousValue);


        System.out.println(map);


        //concurrentHashMap don't allow to add null key or value
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(100, null); //allowed
        concurrentMap.put(null, "empty"); //allowed

        System.out.println(concurrentMap);



    }

}
