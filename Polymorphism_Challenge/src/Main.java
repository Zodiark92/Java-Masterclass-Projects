import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Insert the make of a car or Q to exit: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("Q")){
                break;
            }

            getCarDescription(input);
        }
    }

    public static void getCarDescription(String description){

        Car car = Car.getCar(description);
        if(car != null){
            car.startEngine();
            car.drive();
            return;
        }

        System.out.println("Make not found");
    }
}