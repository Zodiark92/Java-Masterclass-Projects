public class Hello {

    public static void main(String[] args){
        System.out.println("Hello, Tim");
       // System.out.print("Hello World!");

        boolean isAlien = false;

        if(isAlien == true) {
            System.out.println("It is not alien!");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You have the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than the second top score e less than 100");
        }

        int score = 50;

        //if(score = 50){
        //    System.out.println("This is an error");
       // }

        boolean isCar=false;

        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("The car is domestic in the country");
        }

        String s = (isDomestic) ? "The car is domestic" : "The car is not domestic";
        System.out.println(s);


    }
}
