package homework.day8.hw;

import java.util.Arrays;
import java.util.List;
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
            if (pattern.matcher(bird).results().count() > 1) {
                birdsWithVowels++;
            }
        }
        System.out.println(birdsWithVowels);

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        //Заменить 3-й элемент списка на Синица
        birds.set(3, "Синица");

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
