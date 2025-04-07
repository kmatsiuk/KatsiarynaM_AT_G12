package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static void generateDirection() { //ругаеца
        Random random = new Random();
        int a = random.nextInt(39) + 1; //почему
        if (a >= 1 && a <= 9) {
            System.out.println("NORTH");
        } else if (a >= 10 && a <= 19) {
            System.out.println("SOUTH");
        } else if (a >= 20 && a <= 29) {
            System.out.println("WEST");
        } else if (a >= 30 && a <= 39) {
            System.out.println("EAST");
        } else {
            System.out.println("Значение больше 39 - ошибка");
        }
    }
}
