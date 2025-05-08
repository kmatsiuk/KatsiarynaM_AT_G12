package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        String result = "";
        int a = 0;
        for (String country : countries) {
            if (a < countries.size() - 1) { //a?...
                result = result + country + ", ";
                a++;
            } else {
                result = result + country;
            }
        }
        System.out.println(result);

        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).length() < 7) {
                System.out.println(countries.get(i) + " ");
            }
        }
    }
}
