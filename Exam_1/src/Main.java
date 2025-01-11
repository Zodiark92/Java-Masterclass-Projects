import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        int startNumber = 0;
        int endNumber = 0;

        do {
            try{
                System.out.print("Enter a starting number: ");
                String inputStartNumber = scanner.next();
                startNumber = Integer.parseInt(inputStartNumber);

                System.out.print("Enter an ending number: ");
                String inputEndNumber = scanner.next();
                endNumber = Integer.parseInt(inputEndNumber);

                if(startNumber > endNumber){
                    System.out.println("The start number should be less than the final number");
                } else {
                    isValid = true;
                }

            } catch (NumberFormatException e){
                System.out.println("Character not allowed. Please insert a number.");
            }

        } while (!isValid);

        int number = startNumber;

        while(number <= endNumber){
            System.out.print(number + " ");
            number++;
        }

    }

}
