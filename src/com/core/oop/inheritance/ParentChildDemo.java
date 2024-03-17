package com.core.oop.inheritance;

public class ParentChildDemo {

    public static void main(String[] args) {

        Parent p1 = new Child();
        p1.methodXYZ(); //child method called

        Parent p2 = new Parent();
        p2.methodXYZ(); //parent method called


        Child c1 = new Child();
        c1.methodXYZ();  //child method called

        //Child c2 = new Parent();
        // cast error : incompatible types Parent cant be converted to Child

    }
}
