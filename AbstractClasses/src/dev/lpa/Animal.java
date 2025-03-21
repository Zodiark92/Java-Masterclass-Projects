package dev.lpa;

abstract class Mammal extends Animal {

    //it does not need to implement the Animal methods since it is an abstract class

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType());
        System.out.println(speed.equalsIgnoreCase("slow") ? "walks" : "run");
    }

    public abstract void shedHair();
}

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType(){
        return this.getClass().getSimpleName()  + " (" + type + ")";
    }
}
