package homework.day8.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        String result = "";
        try (BufferedWriter writes = new BufferedWriter(new FileWriter("for.txt"))) {
            for (int i = 0; i < figures.size(); i++) {
                if (i < figures.size() - 1) {
                    result = figures.get(i) + " - ";
                } else {
                    result = figures.get(i);
                }
                System.out.print(result);
                writes.write(result);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
        System.out.println();

        int count = 0;

        for (String figure : figures) {
            if (!figure.contains("и")) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.set(3, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
