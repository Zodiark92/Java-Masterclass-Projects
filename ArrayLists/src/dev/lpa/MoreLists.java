package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"Bananas", "Apples", "Oranges"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());
      //  System.out.println(list.getClass().getSimpleName());
     //   list.add("eggs"); -> throws UnsopportedOperationException

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickels", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third Element: " + groceries.get(2));
        System.out.println("Fourth Element: " + groceries.get(3));

        if(groceries.contains("mustard")){
            System.out.println("Mustard contained in the list");
        }

        groceries.add("Yogurt");

        System.out.println("Yogurt index: " + groceries.indexOf("Yogurt"));
        System.out.println("Last index of: " + groceries.lastIndexOf("Yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        groceries.remove("Yogurt");
        System.out.println(groceries);

        //delete all elements from the list
        groceries.removeAll(List.of("Oranges", "pickels"));
        System.out.println(groceries);

        //remove every item from the list, which isn't one of the item passed in the argument
        groceries.retainAll(List.of("Apples", "Bananas", "cheese"));
        System.out.println(groceries);

        //removes all items from the list
        groceries.clear();
        System.out.println(groceries);
        System.out.println("Groceries list is empty: " + groceries.isEmpty());

        groceries.addAll(List.of("Bananas", "Apples", "Oranges", "Milk", "Yogurt"));
        groceries.addAll(Arrays.asList("Mustard", "Cheese", "Biscuits", "Salad"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println("Sorted natural order: " + groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println("Reversed order: " + groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));



        
    }
}
