package dev.lpa.burger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meal {

    private double price = 5.0;

    private Item drink;
    private Item side;
    private Burger burger;

    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal (double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public void addToppings(String... toppings) {
        burger.addTopping(toppings);
        System.out.println("Toppings added: \n" + Arrays.toString(toppings));
    }

    @Override
    public String toString() {
        String burgerName = burger.getName(); //access to a method not static
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    public double getTotal() {
        double total = burger.getPrice() + drink.price + side.price;
        for(Item topping : burger.toppings) {
            total += topping.price;
        }
        return Item.getPrice(total, conversionRate);
    }

    private class Item {

        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
           this(name, type, type.equals("burger") ? Meal.this.price : 0.0); //base is a private field of the outer class, Item can access it

        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s %15s $%.2f".formatted(name, type, getPrice(price, conversionRate));
        }

        public String  getName() {
            return name;
        }

        public static double getPrice(double price, double rate) {
            return price * rate;
        }

        public double getPrice() {
            return price;
        }
    }

    private class Burger extends Item {

        private List<Item> toppings = new ArrayList<>();

        public Burger (String name) {
            super(name, "burger");
        }

        private void addTopping(String... toppingsToAdd) {
            for(String topping : toppingsToAdd) {
                Topping tp = Topping.getToppingName(topping);
                toppings.add(new Item(topping, "topping", tp != null ? tp.getToppingPrince() : 0.0));
            }
        }

        @Override
        public String toString() {
            StringBuilder toppingsAdded = new StringBuilder("Toppings added: \n");
            for(var topping : burger.toppings) {
                toppingsAdded.append(topping.name).append("\n");
                toppingsAdded.append(topping.price).append("\n");
            }
            return toppingsAdded.toString();
        }

        private enum Topping {

            TOMATO,
            BACON,
            AVOCADO,
            SALAD,
            CHEDDAR,
            SAUCE_BBQ,
            SAUCE_MAYO,
            SAUCE_KETCHUP,
            MUSHROOMS,
            ONIONS;

            public double getToppingPrince () {

                return switch(this) {
                    case TOMATO, SALAD, CHEDDAR, ONIONS -> 0.5;
                    case BACON, AVOCADO, MUSHROOMS -> 1.0;
                    default -> 0.0;
                };
            }

            public static Topping getToppingName (String topping) {

                return switch(topping) {
                    case "TOMATO" -> TOMATO;
                    case "BACON" -> BACON;
                    case "AVOCADO" -> AVOCADO;
                    case "MUSHROOM" -> MUSHROOMS;
                    case "ONIONS" -> ONIONS;
                    case "SALAD" -> SALAD;
                    case "CHEDDAR" -> CHEDDAR;
                    case "SAUCE_BBQ" -> SAUCE_BBQ;
                    case "SAUCE_MAYO" -> SAUCE_MAYO;
                    case "SAUCE_KETCHUP" -> SAUCE_KETCHUP;
                    default -> null;

                };
            }

        }

    }

}
