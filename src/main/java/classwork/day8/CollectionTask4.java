package classwork.day8;

import java.util.*;

public class CollectionTask4 {
    public static void main(String[] args) {

        String[] words = "мама мыла раму мыла".split(" ");
        Map<Integer, String> myMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            myMap.put(i, words[i]);
        }

        Set<Integer> keys = myMap.keySet();
        for (int key : keys) {
            System.out.println(key);
        }

        Collection<String> values = myMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> couples = myMap.entrySet();
        for (Map.Entry<Integer, String> couple: couples) {
            System.out.println(couple.getKey() + " " + couple.getValue());
        }
    }
}