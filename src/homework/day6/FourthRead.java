package homework.day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FourthRead {
    public static void main(String[] args) {
        String text = "";
        try (BufferedReader reads = new BufferedReader(new FileReader("reading2.txt"))) {
            String line;
            while ((line = reads.readLine()) != null) {
                text = text + line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }

        String noСonsonants = text.replaceAll("[бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");

        try (BufferedWriter writes = new BufferedWriter(new FileWriter("reading2.txt", true))) {
            writes.write("\n\n" + noСonsonants);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
}
