package dev.lpa;

import java.util.Date;

enum FlightStages implements Trackable {

    GROUNDED,

    LAUNCH,

    CRUISE,

    DATA_COLLECTION;


    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        //it allows to cycle the enum. If the element is the last (3), this returns the first element
        return allStages[(ordinal() +1) % allStages.length];
    }
}

record DragonFly (String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    private FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();

    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    static void log(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }

    private static void privateLog(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }

    private void logStage (FlightStages stage, String description) {
        description = stage + ": " + description;
        privateLog(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages  nextStage = FlightEnabled.super.transition(stage);
        logStage(nextStage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    //declared implicitly as public static final variable
    double MILES_TO_KM = 1.60394;

    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();

    //If I add this method the code doesn't compile -> force the classes to implement this method
//    FlightStages transition (FlightStages stage);

    default FlightStages transition (FlightStages stage) {
        //this -> related to runtime instance
//            System.out.println("transition not implemented on " + this.getClass().getName());
//            return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println(getClass().getSimpleName() + " is transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

}

interface Trackable{

    void track();

}

public abstract class Animal {

    public abstract void move();
}
