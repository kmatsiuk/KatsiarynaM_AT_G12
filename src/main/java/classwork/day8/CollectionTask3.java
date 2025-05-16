package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTask3 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] words = "мама мыла раму мыла".split(" "); //create 4rows massive
        for (String i : words) {
            mySet.add(i);
        } //add all words to list mySet one by one
        for (String word : mySet) {
            System.out.println(word);
        }

        System.out.println();
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
