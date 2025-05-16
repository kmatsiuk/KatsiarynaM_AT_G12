package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        String direction = DirectionGenerator.generateDirection();
        rideable.drive(direction);
    }

    public void runRideable (Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
