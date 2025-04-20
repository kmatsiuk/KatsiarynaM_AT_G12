package homework.day4.playground.essence.creatures;
import homework.day4.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction) {
        System.out.printf("I am %s my name is %s and I am flying to %s\n", this.getClass().getSimpleName(), this.name, direction);
    }
}
