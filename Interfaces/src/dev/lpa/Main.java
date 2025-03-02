package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move(); The type you use (the variable you declared, determines which methods you can call)
//        tracked.move();

        //bird runtime object
        flier.takeOff();
        flier.fly();
        flier.land();
        tracked.track();

        System.out.println("*".repeat(20));

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTravelled = 100;
        double milesTraveled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles", kmsTravelled, milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        //ArrayList implements List interface and it is recommended to use interface variable
        List<FlightEnabled> betterFlier = new LinkedList<>();

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        //won't compile is the method parameter is ArrayList
        triggerFliers(betterFlier);
        flyFliers(betterFlier);
        landFliers(betterFlier);



    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable trackable) { // It checks if the class implements Trackable
            trackable.track();
        }

        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.land();
        }
    }
}
