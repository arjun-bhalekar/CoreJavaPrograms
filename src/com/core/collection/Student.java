package com.core.collection;

public class Student implements Comparable<Student> {

    private Integer rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return this.rollNo.compareTo(student.getRollNo());
    }
}
