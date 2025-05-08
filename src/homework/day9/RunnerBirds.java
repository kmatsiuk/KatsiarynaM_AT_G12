package homework.day9;

import java.util.Arrays;
import java.util.List;

public class RunnerBirds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //заменить в каждую букву "о" на букву "а"
        // Собрать все слова в одну строку в нижнем регистре
        // Убрать все символы мягкого знака
        // Разбить на новые строки по букве "б"
        // Отпечатать в консоль с новой строки в виде --Чайка--
        birds.stream().map(x -> x.replace("о", "а"))
                .map(x -> x.toLowerCase())
                .map(x -> x.replace("ь", ""))
                .flatMap(x -> Arrays.stream(x.split("б")))
                .filter(x -> !x.isEmpty()) //убирает пустую строку после дрозда
                .map(x -> "--" + x + "--")
                .peek(System.out::println)
                .toList();
    }

}
