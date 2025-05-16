package homework.day4.playground.utils;
import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random2 = new Random();
        int a = random2.nextInt(1, 80);
        System.out.printf("CoordinatesGenerator: I have generated point with value: %d\n", a);
        return a;
    }
}