package homework.day6;

import homework.day4.playground.essence.creatures.Fly;

import java.io.*;

import static homework.day6.SeventhSer.muha;

public class EightSer implements Serializable {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("muha.tmp"); //переписать на try с ресурсами
            ObjectInputStream ois = new ObjectInputStream(fis);
            Fly muha = (Fly) ois.readObject();
            ois.close();
            System.out.println(muha.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при де-сериализации");
        }
        //пришлось добавлять пустые конструкторы во всех родителей и всем писать Serializable
        try (BufferedWriter writes = new BufferedWriter(new FileWriter("8task.txt", true))) {
            writes.write(muha.toString());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
}
