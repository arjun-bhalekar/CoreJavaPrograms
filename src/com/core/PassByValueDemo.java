package com.core;

import java.util.ArrayList;
import java.util.List;

class Calc {

    public int addNumbers(int x, int y) {
        x = x + 1;
        return (x + y);
    }

}

class Bottle {

    private String contents;

    void getContents() {
        System.out.println("Bottle content : " + contents);
    }

    void setContents(String contents) {
        this.contents = contents;
    }



}

public class PassByValueDemo {

    public static void main(String[] args) {

        //1. Scenario - Pass by value in case of primitive type argument
        Calc calc = new Calc();
        int a = 20, b = 30;
        int result = calc.addNumbers(a, b);
        //value of 'a' won't be change even if 'x' value is changed.
        // as just value of 'a' is copied to value of 'x' variable
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("result : " + result);


        //2. Scenario - Pass by value in case of Object type argument
        Bottle myBottle = new Bottle();
        System.out.println(myBottle);
        myBottle.setContents("Empty");
        myBottle.getContents();

        System.out.println("after fillBottleWithWater()");
        fillBottleWithWater(myBottle); // reference(unique address of object) value is copied to method object variable
        myBottle.getContents();

        //3. Scenario - Pass by value in case of Collection Object type argument
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        updateList(numberList); // reference(unique address of object) value is copied to method object variable
        System.out.println(numberList);
    }

    static void fillBottleWithWater(Bottle givenBottle) {
        System.out.println(givenBottle);
        givenBottle.setContents("Water");

    }

    static void updateList(List<Integer> list) {
        list.add(100);
    }

}
