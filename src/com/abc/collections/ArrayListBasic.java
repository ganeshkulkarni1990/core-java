package com.abc.collections;

import java.util.*;

class Student implements Comparable<Student> {
    int id;

    public Student(int id) {
        this.id = id;
    }

    public String toString() {
        return "Student: " + this.id;
    }

    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object s) {
        return this.id == ((Student) s).id;
    }

    @Override
    public int compareTo(Student student) {
        if (student.id - this.id > 0) {
            return 1;
        } else if (this.id == student.id) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class ArrayListBasic extends Object {

    public static void main(String... args) {
        List list = new ArrayList();

        list.add("1");
        list.add(10);
        list.add(new Student(10));
        list.add(true);

        for (Object i : list) {
            System.out.println(i);
        }

        //System.out.println(list);

        List<Student> list1 = new ArrayList<Student>(20);
        list1.add(new Student(10));
        list1.add(new Student(11));
        list1.add(new Student(12));
        list1.add(new Student(13));

        System.out.println(list1);

        ArrayList<Integer> intList = new ArrayList<>(20);
        intList.add(10);
        intList.add(11);
        intList.add(12);
        intList.add(13);

        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }

        System.out.println(intList);

        intList.add(2, 0);

        System.out.println(intList);

//        for(Integer i : intList){
//            System.out.println(i);
//        }

//        for(int i=0;i<intList.size();i++){
//            System.out.println(intList.get(i)); //this is O(1) constant search
//        }

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Ganesh");
        linkedList.add("Test");
        linkedList.add("abc");
        linkedList.add("sfff");

//        for(String i : linkedList){
//            System.out.println(i);
//        }
        System.out.println(linkedList.get(2)); //this is linear time search
        linkedList.add(2, "Sakshi");
        System.out.println(linkedList);

        Vector vector = new Vector();

        vector.add("1");
        vector.add(10);
        vector.add(new Student(10));
        vector.add(true);
        vector.add(10);

        Vector<String> vector1 = new Vector<>();

        vector1.add("1");
        vector1.add("10");
        vector1.add("12");
        vector1.add("13");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");
        vector1.add("14");

        Vector vector2 = new Vector<>();
        vector2.addAll(intList);
        System.out.println(vector1.capacity());
        System.out.println(vector1);
        System.out.println(vector2);
        int flag = 0;
        for (String s : vector1) {
            if (s != null && s.equals("Ganesh")) {
                System.out.println("Found");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Not Found");
        }
    }
}
