package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elems = new ArrayList<>();
        elems.add("Text field");
        elems.add("Radio");
        elems.add("Check-box");
        elems.add("Drop-down");
        elems.add("Picker");
        elems.add("Breadcrumb");

        for (String elem : elems) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int a = 0;
        for (int i = 0; i < elems.size(); i++) {
            String elem = elems.get(i);
            if (elem.contains(" ") || elem.contains("-")) {
                a++;
            }
        }
        System.out.println(a);
        System.out.print(elems + " ");
        System.out.println();

        elems.add(4, "Spinner");
        elems.remove(2);
        elems.set(5, "Switch");

        for (String elem : elems) {
            System.out.print(elem + " ");
        }
    }
}
