package homework.day4.playground.processors;
import homework.day4.playground.essence.Flyable;
import homework.day4.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String direction = DirectionGenerator.generateDirection();
        flyable.fly(direction);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
