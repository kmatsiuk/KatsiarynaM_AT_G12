package homework.day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ThirdRead {
    public static void main(String[] args) throws IOException {
        String text = ""; //почему не сработало String text; - локальная переменная (внутри метода)
        try (BufferedReader reads = new BufferedReader(new FileReader("reading2.txt"))) {
            String line;
            while ((line = reads.readLine()) != null) { //chto tut proishodit
                text = text + line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }

        String noVowels = text.replaceAll("[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]", "");

        try (BufferedWriter writes = new BufferedWriter(new FileWriter("reading2.txt"))) {
            writes.write(noVowels);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
}
