public class Main {

    public static void main(String[] args) {

        int inches = 68;
        int feet = 5;

        System.out.println(inches + " inches = " + convertToCentimeters(inches) + " centimeters");
        System.out.println(feet + " feet and " + inches + " inches = " + convertToCentimeters(feet,inches) + " centimeters");
    }

    public static double convertToCentimeters(int inches){

        if(inches < 0)
            return -1;

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){

        if(feet < 0 || inches < 0)
            return -1;

        int totalInches = inches + (feet * 12);

        return convertToCentimeters(totalInches);
    }
}
