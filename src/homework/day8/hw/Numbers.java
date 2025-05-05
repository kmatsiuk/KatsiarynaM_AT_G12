package homework.day8.hw;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        int result = 0;
        for (int num : numbers) {
            System.out.println(num);
            result = result + num;
        }
        System.out.println("Сумма: " + result);


        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
