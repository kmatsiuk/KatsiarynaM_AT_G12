package homework.day1.cycletask;

import java.util.Random;
import java.util.Arrays;

public class TaskArray {
    public void printNumbersArray() {
        int n = 7;
        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public void printReversedArray() {
        int[] numbers = {3, 1, 6, 0, 2, 5, 1};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }

    public void printArrayTimesFive() {
        int n = 7;
        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(n);
            System.out.print(numbers[i] * 5 + " ");
        }
    }

    public void printArraySquare() {
        int[] numbers = {2, 4, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] * numbers[i] + " ");
        }
    }

    public void printMinElement() {
        int[] numbers = {6, 4, 9, 1, 5, 7};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Мин = " + min);
    }
    public void swapFirstAndLast() {
        int[] numbers = {10, 20, 30, 40, 50};

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        // выводим результат
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public void sortDescending() {
        int[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
