package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTask2 {
    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long time = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            myList1.add("Yo" +i);
        }

        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            myList2.add("Hi" +i);
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000; i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000; i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
