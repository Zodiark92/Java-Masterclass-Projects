package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

       // gettingElements(placesToVisit);

       // printItinerary(placesToVisit);
       // printItinerary3(placesToVisit);

      //  testIterator(placesToVisit); //iterator

        testListIterator(placesToVisit); // list iterator
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        //stack methods
        list.push("Alice Springs"); //insert at the head of the list
    }

    public static void removeElements(LinkedList<String> list) {
        //list methods
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s = list.remove();
        System.out.println(s + " removed from list");

        String s1 = list.removeFirst(); //removes the first element
        System.out.println(s1 + " removed from list");

        String s2 = list.removeLast(); //removes the last element
        System.out.println(s2 + " removed from list");

        //Queue/Deque methods
        String s3 = list.poll(); //removes the first element
        System.out.println(s3 + " removed from list");

        String s4 = list.pollFirst(); //removes the first element
        System.out.println(s4 + " removed from list");

        String s5 = list.pollLast(); //removes the last element
        System.out.println(s5 + " removed from list");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        //stack method for removing an element
        String p4 = list.pop(); //removes first element
        System.out.println(p4 + " removed from list");

    }

    public static void gettingElements(LinkedList<String> list) {

        System.out.println("Getting element: " + list.get(4));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue methods
        System.out.println("Element from the element: " + list.element());

        //Stack methods
        System.out.println("Element from the peek: " + list.peek());
        System.out.println("Element from the peekFirst: " + list.peekFirst());
        System.out.println("Element from the peekLast: " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        for(int i = 1; i<list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1)  + " to " + list.get(i));
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list)  {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext())  {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at: " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {

        var iterator = list.iterator();
        while(iterator.hasNext()){
          //  System.out.println(iterator.next()); //to print the next element
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            //    list.remove(); // generates ConcurrentModificationException
            }
        }
        System.out.println(list);
    }

    public static void testListIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while(iterator.hasNext()){
            //  System.out.println(iterator.next()); //to print the next element
            if(iterator.next().equals("Brisbane")){
              //  iterator.remove();
                //    list.remove(); // generates ConcurrentModificationException
                iterator.add("Lake Wivenhoe");
            }
        }

        //reversing
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3); // cursor between the 2 and 3 elements
       // System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }
}
