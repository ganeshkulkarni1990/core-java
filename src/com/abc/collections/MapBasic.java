package com.abc.collections;
import java.util.*;

public class MapBasic {
    private static void testMap() {
        Map map = new HashMap();
        map.put(10, 10);
        map.put("ganesh", 10);
        map.put("abc", 1);
        map.put("next", new Student(10));
        map.put(10, 12); //update
        map.put(10, 13); //update

        //iterate map using entrySet
        for (Object object : map.entrySet()) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void testMapGenSorted() {
        Map<String, List<String>> map = new TreeMap<String, List<String>>();
        map.put("ganesh", Arrays.asList("1", "2", "3"));
        map.put("abc", Arrays.asList("2", "3"));
        map.put("9", Arrays.asList("1", "3", "5", "1")); //updated

        //iterate map using entrySet
        for (Object object : map.entrySet()) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void testMapGenLinked() {
        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("ganesh", Arrays.asList("1", "2", "3"));
        map.put("abc", Arrays.asList("2", "3"));
        map.put("9", Arrays.asList("1", "3", "5", "1")); //updated
        map.put("1", Arrays.asList("1", "3", "5", "1")); //updated
        map.put("2", Arrays.asList("1", "3", "5", "1")); //updated
        map.put("3", Arrays.asList("1", "3")); //updated

        //iterate map using entrySet
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void testMapGen() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("ganesh", Arrays.asList("1", "2", "3"));
        map.put("abc", Arrays.asList("2", "3"));
        map.put("abc", Arrays.asList("1", "3", "5", "1")); //updated
        map.put(null, Arrays.asList("1", "100", "500"));

        //iterate map using entrySet
        for (Object object : map.entrySet()) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String... args) {
        //testMap();
        //testMapGen();
        //testMapGenSorted();
        testMapGenLinked();
    }
}
