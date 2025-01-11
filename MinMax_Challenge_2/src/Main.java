import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;

        do{
            System.out.println("Enter a number or any character to quit: ");
            String input = scanner.next();
            double number = 0;

            try {
                number = Double.parseDouble(input);
                if(number > maxValue){
                    maxValue = number;
                }

                if(number < minValue){
                    minValue = number;
                }

            } catch(NumberFormatException e){
                System.out.println("The value entered is not a number. Exiting the loop...");
                isValid = false;
            }

        } while(isValid);

        if(minValue < Double.MAX_VALUE){
            System.out.println("Minimum value inserted: " + minValue);
        } else {
            System.out.println("No minimum value inserted");
        }

        if(maxValue > Double.MIN_VALUE){
            System.out.println("Maximum value inserted: " + maxValue);
        }  else {
            System.out.println("No maximum value inserted");
        }
    }
}
