package homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileTask task1 = new WhileTask();
        task1.printNumbersWhile();
        System.out.println();

        ForTask task2 = new ForTask();
        task2.printNumbersFor();
        System.out.println();

        TaskArray task3 = new TaskArray();
        task3.printNumbersArray();
        System.out.println();
        task3.printReversedArray();
        System.out.println();
        task3.printArrayTimesFive();
        System.out.println();
        task3.printArraySquare();
        System.out.println();
        task3.printMinElement();
        System.out.println();
        task3.swapFirstAndLast();
    }
}
