import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter the number to compute the sin x: ");
                int x = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter a positive integer: ");
                int n = scanner.nextInt();

                if(n<0){
                    throw new InputMismatchException();
                }

                System.out.println("Sin " + x + " until " + n + " power = " + computeSinX(x,n));

                break;

            } catch (Exception e){
                System.out.println("Incorrect value.");
                scanner.nextLine();
            }

        }

    }

    public static double computeSinX(int x, int n){

        double sinX = 0.0;

        for(int j = 0; (2*j+1)<=n; j++){
            int k = 2*j+1;

            if(j % 2 == 0){
                sinX += computeElement(x, k);
            } else {
                sinX -= computeElement(x, k);
            }

            System.out.println("sin " + sinX);
        }

        return sinX;
    }

    private static double computeElement(int number, int power){

        int x = number;

        for(int n = 1; n < power; n++){
            number *= x;
        }
        
        System.out.println("number: " + number);

        int factorial = power;
        for(int l = power; l  > 1; l--){
            factorial *= (l -1);
        }
        System.out.println("factorial: " + factorial);

        return (double) number / factorial;
    }
}
