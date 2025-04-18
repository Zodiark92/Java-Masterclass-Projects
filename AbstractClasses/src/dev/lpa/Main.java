package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();

        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "Big", 100));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "Big", 75));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Clydesdale", "large", 1000 ));

        for(Animal animal : animals) {
            doAnimalStuff(animal);
            System.out.println("Animal: "  + animal.getExplicitType());
            if(animal instanceof Mammal mammal) {
                mammal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
