package homework.day4.playground.utils;
import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume() {
        Random random = new Random();
        int vol;
        Object pourable = null; //Добавила чтобы не мешало следующей домашке
        if (pourable.getClass().getSimpleName().equals("Water")) {
            vol = random.nextInt(50, 100);
        } else {
            vol = random.nextInt(1, 50);
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %d", pourable.getClass().getSimpleName(), vol);
        return vol;
    }
}
