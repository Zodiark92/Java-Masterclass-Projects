package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var townsToVisit = populateTowns();
        var iterator = townsToVisit.listIterator();

        boolean flagProgram = true;
        boolean forward = false;

        printMenu();

        while(flagProgram) {
            if(!iterator.hasPrevious()){
                System.out.println("We are at start at place ->  " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
            System.out.println("We are at end place ->  " + iterator.previous());
            forward = false;
            }
            System.out.print("input: ");
            String input = scanner.nextLine();
            switch(input.toUpperCase()) {
                case "F":
                case "FORWARD":
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println("Next city -> " + iterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case "B":
                case "BACKWARD":
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Previous city -> " + iterator.previous());
                    } else {
                        System.out.println("Reached the start of the list");
                    }
                    break;
                case "L":
                case "LIST PLACES":
                    printList(townsToVisit);
                    break;
                case "M":
                case "MENU":
                    printMenu();
                    break;
                case "Q":
                case "QUIT":
                    System.out.println("Quit program...");
                    flagProgram = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }



    }

    private static LinkedList<Town> populateTowns() {
        LinkedList<Town> townsToVisit = new LinkedList<>();
        addTown(townsToVisit, new Town("Sydney", 0));
        addTown(townsToVisit, new Town("Adelaide", 1374));
        addTown(townsToVisit, new Town("Alice Springs", 2771));
        addTown(townsToVisit, new Town("Brisbane", 917));
        addTown(townsToVisit, new Town("Darwin", 3972));
        addTown(townsToVisit, new Town("Melbourne", 877));
        addTown(townsToVisit, new Town("Melbourne", 3923));

      //  System.out.println(townsToVisit);
        return townsToVisit;
    }

    private static void printList(LinkedList<Town> towns) {
        for(Town town : towns) {
            System.out.println(town);
        }
    }

    private static void printMenu(){
        System.out.println("""
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)List places
                    (M)enu
                    (Q)uit""");
    }

    private static LinkedList<Town> orderByDistance(LinkedList<Town> towns) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i< towns.size() - 1; i++) {
                if(towns.get(i).getDistance() > towns.get(i + 1).getDistance()) {
                    Town temp = towns.get(i);
                    towns.set(i, towns.get(i + 1));
                    towns.set(i+1, temp);
                    flag = true;
                }
            }
        }
        return towns;
    }


   private static LinkedList<Town> addTown(LinkedList<Town> towns, Town town) {

        if(towns.isEmpty()) {
            towns.add(town);
        //    System.out.println(town.getName() + " added");
            return towns;
        }
        //check duplicates
        for(Town t : towns) {
            if(town.getName().equalsIgnoreCase(t.getName())) {
           //     System.out.println("Town " + town.getName() + " already exists");
                return null;
            }
        }
        towns.add(town);
     //   System.out.println(town.getName() + " added");
        return orderByDistance(towns);
   }
}
