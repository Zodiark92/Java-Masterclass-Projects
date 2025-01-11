package dev.lpa;

import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
     //   System.out.println(Arrays.toString(groceryArray));

        ArrayList groceryListRaw = new ArrayList(); // raw declaration, it creates a list of Objects
        groceryListRaw.add("Yogurt"); // I can add an object different from the GrocerArray (without any error)

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
       // groceryList.add("Yogurt"); -> I have a compile time error (better than a runtime error)
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCES", 5));

        groceryList.add(0, new GroceryItem("Apples", "PRODUCE", 6));
        groceryList.set(0, new GroceryItem("Bread"));
        groceryList.remove(1);

        System.out.println(groceryList);

    }
}