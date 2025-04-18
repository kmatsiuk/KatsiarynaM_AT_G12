package homework.day4.playground.runners;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.craft.air.Aircraft;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.creatures.Fly;
import homework.day4.playground.essence.creatures.Insect;
import homework.day4.playground.essence.creatures.Mosquito;
import homework.day4.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor processor1 = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        processor1.runFlyable(flyableCopter);
        processor1.runFlyable(flyableFly);
        processor1.runFlyable(flyablePlane);
        processor1.runFlyable(flyableRocket);
        processor1.runFlyable(flyableMosquito);
        processor1.runFlyable(aircraftCopter);
        processor1.runFlyable(aircraftPlane);
        processor1.runFlyable(aircraftRocket);
        /*processor1.runFlyable(insectFly);
        processor1.runFlyable(insectMosquito);*/ //не понятно
        processor1.runFlyable(aCopter);
        processor1.runFlyable(aPlane);
        processor1.runFlyable(aFly);
        processor1.runFlyable(aMosquito);
        processor1.runFlyable(flyableFly, "никуда");
        processor1.runFlyable(aircraftRocket, "повсюду");
    }
}
