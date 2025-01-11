import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2024;

        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thank you for watching.");

        String yearOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(yearOfBirth);

        return "You have " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thank you for watching.");

        System.out.println("What year were you born?");

        boolean isValidDOB = false;
        int age = 0;

        do{
            System.out.println("Insert the year of birth:");
            String yearOfBirth = scanner.nextLine();
            try{
                age = checkDate(2024, yearOfBirth);
                isValidDOB = age < 0 ? false : true;
            } catch(NumberFormatException e){
                System.out.println("Characters not valid! Please try again.");
            }

        } while (!isValidDOB);

        return "You have " + age + " years old";
    }

    public static int checkDate(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if(dob > currentYear || dob < minimumYear){
            return -1;
        }

        return (currentYear - dob);
    }
}
