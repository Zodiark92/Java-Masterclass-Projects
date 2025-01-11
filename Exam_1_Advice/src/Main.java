import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;


        do {
            System.out.println("Ask me any question");
            scanner.nextLine();
            System.out.println(advice());

            System.out.print("Would you like to ask another question? (y/n): ");
            String input = scanner.next();


            while(true){

                scanner.nextLine();

                if (input.equals("n")) {
                    exitProgram = true;
                    break;
                } else if (input.equals("y")) {
                    break;
                } else {
                    System.out.println("I didn't understand your answer. Please insert (y/n): ");
                    input = scanner.next();
                }
            }

        } while (!exitProgram);

    }

    public static String advice() {

        Random random = new Random();
        int randomNumber = random.nextInt(1, 5);

        return switch (randomNumber) {
            case 1 -> "Very unlikely";
            case 2 -> "All sign point to yes";
            case 3 -> "Think about it";
            case 4 -> "All sign tell me no";
            default -> "This option should not happen";
        };

    }
}
