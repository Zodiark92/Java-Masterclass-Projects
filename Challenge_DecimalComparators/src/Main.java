public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

       int first_number = (int)(first * 1000);
       int second_number = (int)(second * 1000);

        return (first_number == second_number);
    }
}
