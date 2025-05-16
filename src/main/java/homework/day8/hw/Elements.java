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
            //Проитерировать список через for-each и отпечатать слова в консоль через пробел
            System.out.print(elem + " ");
        }
        System.out.println();

        int a = 0;
        for (int i = 0; i < elems.size(); i++) {
            String elem = elems.get(i);
            if (elem.contains(" ") || elem.contains("-")) {
                a++;
            }
            //Проитерировать список по индексу и отпечатать слова в консоль через пробел
            System.out.print(elems.get(i) + " ");
        }
        System.out.println();
        // Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        System.out.println(a);

        elems.add(4, "Spinner");
        elems.remove(2);
        elems.set(5, "Switch");

        for (String elem : elems) {
            System.out.print(elem + " ");
        }
    }
}
