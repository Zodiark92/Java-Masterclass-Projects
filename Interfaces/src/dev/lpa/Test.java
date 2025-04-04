package dev.lpa;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jet());

        OrbitEarth.log("Testing " + new Satellite());

        orbit(new Satellite());

    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable trackable) { // It checks if the class implements Trackable
            trackable.track();
        }

        flier.land();
    }

    private static void orbit(OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
