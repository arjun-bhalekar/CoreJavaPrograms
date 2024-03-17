package com.core.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(104, "D");
        treeMap.put(101, "A");
        treeMap.put(103, "C");
        treeMap.put(99,"Z");
        treeMap.put(99,"Y");

        System.out.println("tree with natural sorting :"+ treeMap); //natural Sorting


        TreeMap<Integer, String> treeMapCustom = new TreeMap<>(new MyIntegerComparator());
        treeMapCustom.put(104, "D");
        treeMapCustom.put(101, "A");
        treeMapCustom.put(103, "C");
        treeMapCustom.put(99,"Z");

        System.out.println("tree with custom sorting :"+treeMapCustom); //custom Sorting

    }
}
