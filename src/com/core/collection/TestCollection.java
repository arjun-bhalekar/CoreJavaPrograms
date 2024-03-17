package com.core.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(5);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(5);
        System.out.println(set);


    }

}
