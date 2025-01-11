import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("*** Welcome to Calculator ***");
        
        double number = 0.0;
        String input = null;
        boolean valueInserted = false;

        while (true) {
            try {
                if(input == null){
                    System.out.print("Insert a number: ");
                    input = scanner.nextLine();
                    number = Double.parseDouble(input);
                    valueInserted = true;
                }

                if(!valueInserted){
                    input = null;
                    continue;
                }

                System.out.println("Actual value: " + number);
                System.out.println("What operation do you want to perform on the number? ");

                System.out.println("""
                        0 - Quit\s
                        1 - Addition\s
                        2 - Subtraction\s
                        3 - Multiplication\s
                        4 - Division\s
                        5 - Square root\s
                        6 - Exponentiation\s
                        7 - Clear\s
                        """);

                System.out.print("Enter the option: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if(choice == 0){
                    System.out.println("Goodbye!!");
                    break;
                } else if (choice > 0 && choice <= 6) {
                    number = operation(choice, number);
                    System.out.println("Result: " + number);
                } else if (choice == 7) {
                    input = null;
                    number=0.0;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Sorry! The input is invalid");
            }

        }
    }

    public static double operation(int input, double number) throws Exception {

        return switch (input) {
            case 1 -> {
                System.out.print("Insert the number to add: ");
                String inputNumber = scanner.nextLine();
                yield number + Double.parseDouble(inputNumber);
            }

            case 2 -> {
                System.out.print("Insert the number to subtract: ");
                String inputNumber = scanner.nextLine();
                yield number - Double.parseDouble(inputNumber);
            }

            case 3 -> {
                System.out.print("Insert the number to multiplicative: ");
                String inputNumber = scanner.nextLine();
                yield number * Double.parseDouble(inputNumber);
            }

            case 4 -> {
                System.out.print("Insert the number to divide it: ");
                String inputNumber = scanner.nextLine();
                double doubleValue = Double.parseDouble(inputNumber);
                if(doubleValue == 0){
                    System.out.println("Impossible to divide by zero");
                    yield number;
                }

                yield  number/doubleValue;
            }

            case 5 -> {
                if(number < 0){
                    System.out.println("Impossible to make the square root of a negative number");
                    yield number;
                }
                yield Math.sqrt(number);
            }

            case 6 -> {
                System.out.print("Insert a positive integer number to exponentiate it: ");
                int exponent = scanner.nextInt();

                if(exponent < 0){
                    throw new Exception();
                }

                double result = number;
               for(int i = 0; i<exponent;i++ ) {
                   result *= number;
               }
               yield result;
            }

            default -> {
                System.out.println("Invalid");
                yield Double.MIN_VALUE;
            }

        };

    }

}







