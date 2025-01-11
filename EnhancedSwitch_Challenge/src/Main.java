public class Main {

    public static void main(String[] args) {

    printDayOfWeek(3);
    printDayOfWeek(6);
    printDayOfWeek(7);

    System.out.println("-------");

    printWeekDay(3);
    printWeekDay(6);
    printWeekDay(7);

    }

    public static void printDayOfWeek(int day){

        String dayOfTheWeek =  switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                System.out.println(day + " not found");
                yield "Invalid day";
            }
        };

       System.out.println(day + " -> " + dayOfTheWeek);
    }

    public static void printWeekDay(int day){

        String dayOfWeek;

        if(day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1){
            dayOfWeek = "Monday";
        } else if (day == 2){
            dayOfWeek = "Tuesday";
        } else if (day == 3){
            dayOfWeek = "Wednesday";
        } else if (day == 4){
            dayOfWeek = "Thursday";
        } else if (day == 5){
            dayOfWeek = "Friday";
        } else if (day == 6){
            dayOfWeek = "Saturday";
        } else {
            System.out.println(day + " not found");
            dayOfWeek = "Invalid value";
        }

        System.out.println(day + " -> " + dayOfWeek);
    }
}
