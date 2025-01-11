package dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {
            try {
                System.out.println("""
                        Actions: 
                            0 - Quit
                            1 - Add items to the list
                            2 - Remove items from the list""");
                System.out.print("Input: ");
                String n = scanner.nextLine();
                if (n.equals("0")) {
                    break;
                }

                if(!n.equals("1") && !n.equals("2")){
                    throw new IllegalStateException("Unexpected value: " + n);
                }

                System.out.print("Insert the list delimited by a comma: ");
                String inputList = (scanner.nextLine()).replace(" ", "");

                String[] tempArray = inputList.split(",");

                if (n.equals("1")) {
                    addItem(tempArray, groceryList);
                } else {
                    removeItem(tempArray, groceryList);
                }

                groceryList.sort(Comparator.naturalOrder());
                printList(groceryList);

            } catch(IllegalStateException e){
                System.out.println("Invalid input");
            }
        }
    }

    private static void addItem(String[] items, ArrayList<String> listItems) {
        for(String item : items){
            if(listItems.contains(item)){
                System.out.printf("The item %s is already present%n", item);
            } else {
                listItems.add(item);
                System.out.printf("The item %s is added to the list%n", item);
            }
        }
    }

    private static void removeItem(String[] items, ArrayList<String> listItems) {
        for(String item : items){
            if(listItems.contains(item)){
                listItems.remove(item);
                System.out.printf("Item %s removed%n", item);
            } else {
                System.out.println("Item not found in the list");
            }
        }
    }

    private static void printList(List<String> list){
        for(String item : list){
            System.out.println("Item: " + item);
        }
    }
}

