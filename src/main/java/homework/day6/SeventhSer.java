package homework.day6;

import homework.day4.playground.essence.creatures.Fly;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeventhSer implements Serializable {
    public static Fly muha = new Fly(13, "Anzhella");
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("muha.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(muha);
            oos.close();

            System.out.println("Объект сериализован");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации");
        }
    }
}
