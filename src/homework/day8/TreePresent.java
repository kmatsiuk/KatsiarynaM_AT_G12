package homework.day8;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreePresent {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            myList1.add("Yo" +i);
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            myList2.add("Yo" +i);
        }

        System.out.println(System.currentTimeMillis() - t0);
        System.out.println("HashSet быстрее");
    }
}
