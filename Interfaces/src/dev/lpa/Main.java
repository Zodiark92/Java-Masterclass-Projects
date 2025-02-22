package dev.lpa;

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

    }
}
