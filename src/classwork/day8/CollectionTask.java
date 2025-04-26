package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String[] words = "мама мыла раму".split(" ");
        for (int i = 0; i < words.length; i++) {
            myList.add(words[i]);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        for (String x : myList) {
            System.out.println(x);
        }
    }

}
