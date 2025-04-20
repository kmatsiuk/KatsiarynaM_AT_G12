package homework.day4.playground.utils;
import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int a = random.nextInt(1, 100) ;
        System.out.printf ("I have generated distance with value: %d\n", a);
        return a;
    }
}
