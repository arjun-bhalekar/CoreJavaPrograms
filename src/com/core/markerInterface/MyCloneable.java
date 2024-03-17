package com.core.markerInterface;

/**
 * If we want to
 */
public class MyCloneable implements Cloneable{

    private int size;
    private String name;

    public MyCloneable(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyCloneable{" +
                "hashCode=" + this.hashCode() +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        MyCloneable myCloneable = new MyCloneable(20, "Test20");
        System.out.println("Original Object : "+myCloneable.toString());

        try {
            MyCloneable cloneObject = (MyCloneable) myCloneable.clone();
            System.out.println("Clone of Object : "+cloneObject.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
