package classwork.day5;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаёт объект scanner, который будет читать ввод с клавиатуры (из System.in).

        while (scanner.hasNext()) { //Запускает бесконечный цикл, который работает, пока в консоли что-то вводится.
            String incoming = scanner.nextLine(); //Считывает введённую строку и сохраняет её в переменную incoming.
            if (incoming.contains("help")) { //Проверяет: если введённая строка содержит "help", то программа завершается (return выходит из main).
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
