package homework.day6;

import java.util.Scanner;

public class FirstInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("exit")) {
                break;
            }
            System.out.printf("Hello, I just got '%s' from you!", incoming);
        }

    }
}
