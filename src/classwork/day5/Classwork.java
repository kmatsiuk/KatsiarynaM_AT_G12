package classwork.day5;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.contains("help")) {
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
