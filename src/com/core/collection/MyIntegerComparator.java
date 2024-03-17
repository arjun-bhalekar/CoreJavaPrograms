package com.core.collection;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer i1, Integer i2) {
        if(i1 == i2) {
            return 0;
        } else if(i1 > i2) {
            return -1;
        }else {
            return 1;
        }
    }
}
