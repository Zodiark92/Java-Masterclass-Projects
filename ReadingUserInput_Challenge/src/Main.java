import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readAndSumNumbers();
    }

    public static void readAndSumNumbers(){

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        do {
            System.out.println("Enter number #" + count + ": ");
            try {
                String number = scanner.nextLine();
                sum += Integer.parseInt(number);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }

        } while (count <= 5);

        System.out.println("Sum of the number: " + sum);

    }
}
