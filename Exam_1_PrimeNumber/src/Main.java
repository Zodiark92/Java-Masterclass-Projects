import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            try {
                System.out.print("Insert a number: ");
                int number = scanner.nextInt();

                if(isPrimeNumber(number) && number > 0){
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number");
                }

                break;

            } catch(Exception e){
                System.out.println("Invalid input");
                scanner.nextLine();
            }

        }

    }

    public static boolean isPrimeNumber(int number){

        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
