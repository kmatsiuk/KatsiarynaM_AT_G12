package homework.day6;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SixthRead {
    public static void main(String[] args) {
        String text = "";
        LocalDateTime dateTimeNow = LocalDateTime.now();
        try (BufferedReader reads = new BufferedReader(new FileReader("reading3.txt"))) {
            String line;
            while ((line = reads.readLine()) != null) {
                text = text + line + "\n";
            }
        } catch (
                IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
        
        int symbols = text.length();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timestamp = dateTimeNow.format(formatter);
        String fileName = "file_" + timestamp + "_" + symbols + ".txt";

        try (BufferedWriter writes = new BufferedWriter(new FileWriter(fileName))) {
            writes.write(String.valueOf(symbols));
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
}
