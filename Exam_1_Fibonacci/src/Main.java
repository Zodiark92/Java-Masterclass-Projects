import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter a number: ");
                int numberInput = scanner.nextInt();

                if(numberInput > 0) {
                    System.out.println(fibonacciSeries(numberInput));
                    break;
                } else {
                    System.out.println("Invalid input. Insert a positive number greater than 0");
                }

            } catch(Exception e){
                System.out.println("Invalid input");
                scanner.nextLine();
            }

        }
    }

    public static String fibonacciSeries(int n){

        String fibonacci = "";
        int numberSeries = 0;
        int firstNumber = 0;
        int secondNumber = 1;


        for(int i=0; i < n; i++){
            if(i == 0 || i==1){
              fibonacci +=  i + " ";
            } else {
                numberSeries = firstNumber + secondNumber;
                fibonacci += numberSeries + " ";

                firstNumber = secondNumber;
                secondNumber = numberSeries;
            }

        }

        return fibonacci;
    }
}
