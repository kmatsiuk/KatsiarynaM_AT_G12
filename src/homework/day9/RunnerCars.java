package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class RunnerCars {
    public static void main(String[] args) {
        List<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                .toList();

        //убрать дубликаты, результат в консоль
        //пропустить одно название
        //верхний регистр
        //отпечатать с новой строки
        cars.stream().distinct().skip(1).map(s -> s.toUpperCase()).peek(System.out::println).toList();
    }
}
