package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class RunnerCountries {
    public static void main(String[] args) {
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия").toList();

        countries.stream().filter(x -> x.matches(".*[аеёиоуыэюяАЕЁИОУЫЭЮЯ].*"))
                .filter(x -> x.length() < 7)
                .map(x -> x.toUpperCase())
                .map(x -> "\"" + x + "\"")
                .peek(System.out::println)
                .toList();
    }
}
