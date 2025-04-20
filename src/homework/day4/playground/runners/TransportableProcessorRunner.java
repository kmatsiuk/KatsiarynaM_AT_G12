package homework.day4.playground.runners;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.essence.craft.air.Aircraft;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Moped;
import homework.day4.playground.essence.craft.field.Motorbike;
import homework.day4.playground.essence.craft.field.Vehicle;
import homework.day4.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor processor2 = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        processor2.runTransportable(transportableCopter);
        processor2.runTransportable(transportableCar);
        processor2.runTransportable(transportableMoped);
        processor2.runTransportable(transportablePlane);
        processor2.runTransportable(transportableRocket);
        processor2.runTransportable(transportableMotorbike);
        processor2.runTransportable(aircraftCopter);
        processor2.runTransportable(aircraftRocket);
        processor2.runTransportable(aircraftPlane);
        processor2.runTransportable(vehicleCar);
        processor2.runTransportable(vehicleMoped);
        processor2.runTransportable(vehicleMotorbike);
        processor2.runTransportable((Transportable) flyableRocket);
        processor2.runTransportable((Transportable) flyableCopter);
        processor2.runTransportable((Transportable) flyablePlane);
        processor2.runTransportable((Transportable) rideableMoped);
        processor2.runTransportable((Transportable) rideableCar);
        processor2.runTransportable((Transportable) rideableMotorbike);
        processor2.runTransportable(aCopter);
        processor2.runTransportable(aCar);
        processor2.runTransportable(aPlane);
        processor2.runTransportable(aRocket);
        processor2.runTransportable(aMoped);
        processor2.runTransportable(aMotorbike);
        processor2.runTransportable(aCar, 23, 242);
    }
}
