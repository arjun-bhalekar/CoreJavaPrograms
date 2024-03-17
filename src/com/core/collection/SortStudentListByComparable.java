package com.core.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudentListByComparable {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(104, "Vilas"));
        studentList.add(new Student(102, "Vikas"));
        studentList.add(new Student(100, "Arjun"));
        studentList.add(new Student(103, "Hemant"));

        System.out.println("------- Unsorted Student List ----------");
        studentList.forEach(System.out::println);

        List<Student> sortedStudentList = studentList.stream().sorted()
                .collect(Collectors.toList());

        System.out.println("------- Sorted by RollNo ----------");
        sortedStudentList.forEach(System.out::println);

        List<Student> sortedStudentListByName = studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println("------- Sorted by Name ----------");
        sortedStudentListByName.forEach(System.out::println);
    }
}
