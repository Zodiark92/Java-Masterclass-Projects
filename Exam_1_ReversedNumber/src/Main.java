import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            try{
                System.out.print("Insert a number: ");
                int numberInput = scanner.nextInt();

                System.out.println("Number reversed: " + reverseNumber(numberInput));
                break;

            } catch(Exception e){
                    System.out.println("Invalid input.");
                    scanner.nextLine();
            }
        }
    }

    public static int reverseNumber(int number) {

        int tempNumber = number;

        int digits = 1;

        while(tempNumber / 10 != 0){
            tempNumber /= 10;
            digits++;
        }

        int reverseNumber = 0;

        for(int i=digits - 1; i >= 0; i--){

             tempNumber = number % 10;

            for(int j = 0; j < i; j++){
                tempNumber *= 10;
            }

            reverseNumber += tempNumber;
            number /= 10;
        }

        return reverseNumber;
    }
}
