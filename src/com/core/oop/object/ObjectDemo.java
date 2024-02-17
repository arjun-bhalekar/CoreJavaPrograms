package com.core.oop.object;


class Pen {

    int price;
    String name;
    String color;

    void write() {
        System.out.println("Writing with " + name + " Pen");
    }


}


/**
 * Object is any entity that has state and behaviour. For e.g. Chair, Pen , Car etc. <br/>
 * An Object can be defined as instance of a class.
 * Let's take example of Pen Object. It has states like name, color etc. and behaviour like writing.
 */
public class ObjectDemo {

    public static void main(String[] args) {

        Pen myPen = new Pen(); //to create Object of Pen class with name as myPen

        //setting its properties
        myPen.name = "Cello";
        myPen.color = "Blue";
        myPen.price = 10;

        //calling its behaviour i.e. operations
        myPen.write();
    }
}
