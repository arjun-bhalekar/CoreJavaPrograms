package com.core.stringRelated;

public class StringInternMethodTest {

    public static void main(String[] args) {

        //case1
//        String s1 = new String("India"); //creates new string India in Heap Area
//        String s2 = new String("India");
//
//        System.out.println(s1.hashCode() == s2.hashCode()); //true
//        System.out.println(s1 == s2); //false

        //case2
//        String s1 = "India"; //creates new string India in SCP(String Constant Pool) Area
//        String s2 = "India"; //s1 is existing in SCP so same reference is given
//
//        System.out.println(s1.hashCode() == s2.hashCode()); //true
//        System.out.println(s1 == s2); //false


        //case3
        String s1 = new String("India").intern(); //creates new string India in SCP(String Constant Pool) Area
        String s2 = new String("India").intern();

        System.out.println(s1.hashCode() == s2.hashCode()); //true
        System.out.println(s1 == s2); //false


    }

}
