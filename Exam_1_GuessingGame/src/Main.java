import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 10;

        int randomNumber = random.nextInt(minNumber,maxNumber);

     //   System.out.println("Random number: " + randomNumber);

        boolean isValid = false;
        boolean isFirstEntry = true;

        do{
            try{
                if(isFirstEntry){
                    System.out.print("Guess a number between 1 and 10: ");
                    isFirstEntry = false;
                } else {
                    System.out.println("Guess another number between 1 and 10: ");
                }

                int numberInput = scanner.nextInt();

                if(numberInput < randomNumber){
                    System.out.println("You guessed too low");
                } else if (numberInput > randomNumber){
                    System.out.println("You guessed too high.");
                } else {
                    System.out.println("You got it!!");
                    isValid = true;
                }


            } catch(NumberFormatException e){
                System.out.println("Invalid input. Please insert a number");
            }

       } while(!isValid);


    }
}
