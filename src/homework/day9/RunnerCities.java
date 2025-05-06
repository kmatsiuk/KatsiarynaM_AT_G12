package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class RunnerCities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
    //  Посчитать сумму всех буков во всех словах и вывести число в консоль
        System.out.println(cities.stream().mapToInt(x -> x.length()).sum());
    }
}
