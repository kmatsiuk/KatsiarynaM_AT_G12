package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %d points\n", transportable.getClass().getSimpleName(), distance);
    }

    public void runTransportable(Transportable transportable) {
        int distance = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.printf("Transportable %s was moved to %d points\n", transportable.getClass().getSimpleName(), distance);
    }
}
