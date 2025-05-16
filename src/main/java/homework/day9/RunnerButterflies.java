package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class RunnerButterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // Добавить к каждому элементу кавычки
        // Оставить только те слова, которые содержат букву "a" и букву "о"
        // Вывести слова в консоль с новой строки
        butterflies.stream().map(add -> "\"" + add+ "\"")
                .filter(cont -> cont.contains("o") && cont.contains("a"))
                .forEach(System.out::println);
    }
}
