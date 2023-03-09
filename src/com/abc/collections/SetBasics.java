package com.abc.collections;

import java.util.*;

class Test{

}
public class SetBasics {
    public static void main(String... args) {

//        Set set = new HashSet();
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        set.add("4");
//        set.add("5");
//        set.add("2");
//        set.add("Ganesh");
//        set.add("6");
//
//        for(Object s: set){
//            System.out.print(s+"  ");
//        }
//        System.out.println();
//        System.out.println(set);
//
//
//        Set<Integer> intSet = new HashSet<>();

//        for(int i=0;i<1000;i++){
//            intSet.add(i % 129);
//        }
//        System.out.println(intSet);

//        List<Integer> intList = new ArrayList<>();
//
//        for(int i=0;i<1000;i++){
//            intList.add(i % 129);
//        }
//        System.out.println(intList);

//        Set<Test> sortedSet = new HashSet<>();
//        sortedSet.add(new Test());
//        sortedSet.add(new Test());
//        sortedSet.add(new Test());
//        sortedSet.add(new Test());
//        sortedSet.add(new Test());
//        sortedSet.add(new Test());
//
//        for (Test i : sortedSet) {
//            System.out.print(i + " ");
//        }
//        System.out.println();


//        Set<Student> sortedStudentSet = new TreeSet<>();
//        sortedStudentSet.add(new Student(100));
//        sortedStudentSet.add(new Student(1));
//        sortedStudentSet.add(new Student(2));
//        sortedStudentSet.add(new Student(300));
//        sortedStudentSet.add(new Student(278));
//        sortedStudentSet.add(new Student(1));
//        sortedStudentSet.add(new Student(2));
//
//        for (Student student : sortedStudentSet) {
//            System.out.print(student + " ");
//        }
//        System.out.println();



        Set<Student> sortedStudentSet = new LinkedHashSet<Student>();
        sortedStudentSet.add(new Student(100));
        sortedStudentSet.add(new Student(1));
        sortedStudentSet.add(new Student(2));
        sortedStudentSet.add(new Student(300));
        sortedStudentSet.add(new Student(278));
        sortedStudentSet.add(new Student(1));
        sortedStudentSet.add(new Student(2));

        for (Student student : sortedStudentSet) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
