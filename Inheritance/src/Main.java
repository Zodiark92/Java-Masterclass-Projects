public class Main {
    public static void main(String[] args) {

    Animal animal = new Animal("Generic animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast");

    Dog yorkie = new Dog("Yorkie",15);
    doAnimalStuff(yorkie, "fast");

    Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriever, "slow");

    Dog wolf = new Dog("Wolf", 40);
    doAnimalStuff(wolf, "slow");

    Fish goldie = new Fish("Goldfish", 0.25, 2,3);
    doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);

        System.out.println("------------");
    }
}