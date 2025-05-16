package homework.day9;

import java.util.stream.Stream;

public class RunnerFigures {
    public static void main(String[] args) {
        Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .map(x -> x.length()).filter(x -> x > 4).forEach(System.out::println);
        // Заменить каждое слово на целое число, соответствующее количеству букв в слове
        // Отфильтровать числа, которые больше 4
        // Отпечатать все оставшиеся числа в консоль
    }
}
