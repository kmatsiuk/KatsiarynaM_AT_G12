package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        int counter = 0;
        for (String city : cities) {
            counter = counter + city.length();
        }
        System.out.println(counter);
    }
}
