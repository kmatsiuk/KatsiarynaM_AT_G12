package homework.day4.playground.essence.creatures;
import homework.day4.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public void fly(String direction) {
        System.out.printf("I am HELP my name is %s and I am flying to %s", this.getClass().getSimpleName(), direction);
    }
}
