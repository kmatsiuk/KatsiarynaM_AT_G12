package homework.day8.hw;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.print("--" + bird + "-- ");
        }
        System.out.println();

        Pattern pattern = Pattern.compile("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");
        int birdsWithVowels = 0;
        for (String bird : birds) {
            Matcher matcher = pattern.matcher(bird); //не пошло
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            if (counter > 1) {
                birdsWithVowels = birdsWithVowels + 1;
            }
        }
        System.out.println(birdsWithVowels);
    }
}
