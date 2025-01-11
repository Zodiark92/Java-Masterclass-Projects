import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        int result = 0;

        do {
            try{
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if(number >= 0){
                    result = calculateFactorial(number);
                    isValid = true;

                    System.out.println("Factorial number of " + number + ": " + result);
                } else {
                    System.out.println("Please insert a number greater than zero to calculate the factorial.");
                }

            } catch(Exception e){
                System.out.println("Not valid. Please insert a number.");
                scanner.nextLine();
            }

        } while(!isValid);

    }

    public static int calculateFactorial(int number){

        if(number == 0){
            return 1;
        }

        int factorial = number;

        for(int i = number - 1; i > 0; i--){
            factorial *= i;
        }

        return factorial;
    }
}
