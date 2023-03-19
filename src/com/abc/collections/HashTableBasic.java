package com.abc.collections;

import java.util.*;

public class HashTableBasic {
    public static void main(String... args) {

//        Hashtable hashTable = new Hashtable();
//
//        hashTable.put("Ganesh", 10);
//        hashTable.put(new Student(10), 10);
//        hashTable.put(new Student(10), 11); //same key update
//        //System.out.println(hashTable);
//        //hashmap, treemap linkedhashmap, hashtable
//        Iterator iterator = hashTable.entrySet().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
        Hashtable<String, String> stringHash = new Hashtable<String, String>();
        stringHash.put("Ganesh", "10");
        stringHash.put("abc", "11");
        stringHash.put("abc", "12");
        stringHash.put("abc", "13");
        stringHash.put("abc", "14");
        stringHash.put("new", "test");

        //System.out.println(hashTable);
        //hashmap, treemap linkedhashmap, hashtable
        Iterator itr = stringHash.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
