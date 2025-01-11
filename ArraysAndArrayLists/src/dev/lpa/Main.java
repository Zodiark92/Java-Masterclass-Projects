package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            String[] originalArray = new String[] {"First", "Second", "Third"};
            var originalList = Arrays.asList(originalArray);

            //Any changes to the list have an effect also to the array
            originalList.set(0, "Apple");
            System.out.println("Array: " + Arrays.toString(originalArray));
            System.out.println("List: " + originalList);

            originalList.sort(Comparator.naturalOrder());
            System.out.println(Arrays.toString(originalArray));

        List<String> listItems = new ArrayList<>(List.of("Milk", "Tomato", "Bread"));
        String[] arrayItems = listItems.toArray(new String[5]);
        System.out.println(Arrays.toString(arrayItems));
    }
}
