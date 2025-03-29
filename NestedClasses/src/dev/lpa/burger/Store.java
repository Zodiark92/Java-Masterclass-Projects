package dev.lpa.burger;

public class Store {

    public static void main(String[] args) {


        Meal USRegularMeal = new Meal(0.68);
        USRegularMeal.addToppings("Cheddar", "Bacon");

        System.out.println(USRegularMeal);


        
    }
}
