package homework.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String incoming = scanner.nextLine();

        try (BufferedWriter create = new BufferedWriter(new FileWriter("domashka.txt", true))) { //ne peretiraetsia
            create.write(String.format("Hello, I just got '%s' from you!\n", incoming));
            //a zachem nuzhen .close?
        } catch (IOException e) {
            System.out.println("Ошибка при записи");
        }
/*        BufferedWriter create = null;
        try {
            create = new BufferedWriter(new FileWriter("domashka.txt", true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                create.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
    }
}
