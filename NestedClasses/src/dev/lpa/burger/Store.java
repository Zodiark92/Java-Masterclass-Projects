package dev.lpa.burger;

import javax.naming.InvalidNameException;

public class Store {

    public static void main(String[] args) throws InvalidNameException {


        Meal USRegularMeal = new Meal();
        USRegularMeal.addToppings("Cheddar", "Bacon", "Sauce_BBQ", "Salad");

        System.out.println(USRegularMeal);

    }
}
