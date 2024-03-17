package com.core.markerInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EntityDao {


    public void delete(Entity entity) {

        if(!(entity instanceof Deletable)) {
           throw new RuntimeException("Delete not supported");
        } else {
            //delete success
            System.out.println("deleted successfully");
        }
    }

    public static void main(String[] args) {

        EntityDao entityDao = new EntityDao();
        entityDao.delete(new Entity());


        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(40);

        System.out.println(integerList);

        List<Integer> unmodifiableList = Collections.unmodifiableList(integerList);
        unmodifiableList.add(30); //java.lang.UnsupportedOperationException
    }
}
