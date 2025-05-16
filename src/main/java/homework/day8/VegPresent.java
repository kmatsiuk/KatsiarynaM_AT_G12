package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class VegPresent {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String veg : vegetables) {
            System.out.print(veg + " ");
        }
        System.out.println();

        int count = 0;

        for (String veg : vegetables) {
            if (veg.contains("а")) {
                count++; //неоч
            }
        }
        System.out.println(count);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }
        System.out.println();

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String veg : vegetables) {
            System.out.print(veg + " ");
        }
    }
}
