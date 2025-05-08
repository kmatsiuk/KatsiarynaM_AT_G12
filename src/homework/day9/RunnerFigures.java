package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class RunnerFigures {
    public static void main(String[] args) {
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .toList();

        // Заменить каждое слово на целое число, соответствующее количеству букв в слове
        // Отфильтровать числа, которые больше 4
        // Отпечатать все оставшиеся числа в консоль
        System.out.println(figures.stream().map(x -> x.length()).filter(x -> x > 4).toList());
    }
}
