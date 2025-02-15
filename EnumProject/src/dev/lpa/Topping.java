package dev.lpa;

public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {
        return switch(this) {
            case BACON -> 2.5;
            case CHEDDAR -> 1.5;
            default -> 0.0;
        };
    }
}
