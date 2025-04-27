package homework.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FifthRead {
    public static void main(String[] args) {
        String text = "";
        try (BufferedReader reads = new BufferedReader(new FileReader("reading3.txt"))) {
            String line;
            while ((line = reads.readLine()) != null) {
                text = text + line + "\n";
            }
        } catch (
                IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
        System.out.println("Количество символов в файле: " + text.length()); //pochemu 12
    }
}
