package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String bug : butterflies) {
            System.out.print("\"" + bug + "\"" + " ");
        }
        System.out.println();

        int counter = 0;

        for (String bug : butterflies) {
            if (bug.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String bug : butterflies) {
            System.out.println(bug);
        }
        
    }
}
