import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;
        int sum = 0;
        int numberInserted = 0;

        do {
            try {
                if(sum == 0){
                    System.out.print("Enter an integer value, (0 to end and get average): ");
                } else {
                    System.out.print("Enter an integer value, (0 to end and get average): ");
                }

                String inputNumber = scanner.next();
                int number = Integer.parseInt(inputNumber);

               if(number == 0) {
                   exitProgram = true;
               } else {
                   sum += number;
                   numberInserted++;
               }

            } catch (Exception e){
                System.out.println("Please insert a valid character.");
            }

        } while (!exitProgram);

        if(numberInserted != 0){
            System.out.println("The average is: " + sum/numberInserted);
        } else {
            System.out.println("No numbers inserted");
        }

    }
}
