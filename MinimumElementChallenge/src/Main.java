import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the series of numbers separated by a comma: ");

        int[] integersArray = readIntegers(scanner.nextLine());
        System.out.println("Input array: " + Arrays.toString(integersArray));

       // System.out.println("Minimum element of the array: " + getMin(integersArray));

      //  System.out.println("Reversed array: " + Arrays.toString(reverseArray(integersArray)));
        System.out.println("Reversed array: " + Arrays.toString(reverseCopy(integersArray)));

    }

    private static int[] readIntegers(String inputNumbers) {
        String[] inputArray = inputNumbers.split(",");

        int[] intArrayInput = new int[inputArray.length];
        for(int i=0;i< intArrayInput.length;i++){
            intArrayInput[i] = Integer.parseInt(inputArray[i].trim());
        }
        return intArrayInput;
    }

    private static int getMin(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] array){
        for(int i=0; i< array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -1- i];
            array[array.length-1-i] = temp;

        }
        return array;
    }

    private static int[] reverseCopy(int[] array){

        int[] reversedArray = new int[array.length];
        int maxIndex = reversedArray.length - 1;

        for(int element : array){
            reversedArray[maxIndex] = element; //decrement after the assignment is completed
            maxIndex--;
        }
        return reversedArray;
    }
}