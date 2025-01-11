import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {58, 65, 3, 2, 55};
        System.out.println(Arrays.toString(sortIntegers(array)));

        printArray(array);

    }

    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[size];

        for(int i = 0; i< inputArray.length; i++){
            inputArray[i] = scanner.nextInt();
        }

        return inputArray;
    }

    public static void printArray(int[] array) {

        for(int i = 0; i< array.length; i++){
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i=0; i< sortedArray.length -1; i++){
                if(sortedArray [i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}