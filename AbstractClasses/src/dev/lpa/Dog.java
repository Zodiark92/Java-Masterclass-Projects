package dev.lpa;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType() + " is walking");
        } else {
            System.out.println(getExplicitType() + " is running");
        }

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("Wolf")) {
            System.out.println("howling! ");
        } else {
            System.out.println("Woof!! ");
        }
    }
}
