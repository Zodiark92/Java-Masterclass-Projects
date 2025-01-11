import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax(){

        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while(true){
            System.out.print("Insert a number or any character to quit: ");
            try{
                number = Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e){
                break;
            }

            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }
        }

        if(min == Double.MAX_VALUE || max == Double.MIN_VALUE){
            System.out.println("No number inserted");
            return;
        }

        System.out.println("Minimum number inserted: " + min);
        System.out.println("Maximum number inserted: " + max);
    }
}
