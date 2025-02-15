package dev.lpa;

import java.time.DayOfWeek;
import java.util.Random;



public class main {

    public static void main(String[] args) {

        DayOfTheWeek dayWeek = DayOfTheWeek.SUN;
        System.out.println(dayWeek);

        for(int i=0; i<10; i++) {
            dayWeek = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", dayWeek.name(), dayWeek.ordinal());

            if(dayWeek == DayOfTheWeek.FRI){
                System.out.println("Found Friday!!");
            }
        }

        System.out.println("-".repeat(30));

        for(int i=0; i<10; i++) {
            dayWeek = getRandomDay();
            switchDayOfWeek(dayWeek);
        }

        //Toppings
        for(Topping topping : Topping.values()){
            System.out.printf("Topping name: %s, topping price: %.2f%n", topping.name(), topping.getPrice());
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek dayOfWeek) {
        int weekDayInteger = dayOfWeek.ordinal() + 1;

        switch(dayOfWeek) {
            case WED -> System.out.println("Wednesday is the day " + weekDayInteger);
            case MON ->  System.out.println("Monday is the day " + weekDayInteger);
            default -> System.out.println(dayOfWeek.name().charAt(0) + dayOfWeek.name().substring(1).toLowerCase()
                    + "day is the day " + weekDayInteger);
        }
    }

    private static DayOfTheWeek getRandomDay(){

        int randomInt = new Random().nextInt(6);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInt];

    }
}
