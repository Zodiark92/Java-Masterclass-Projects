import java.util.Scanner;

public class MinElement_Ex {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return Integer.parseInt(input);
    }

    private static int[] readElements(int elements){
        Scanner scanner = new Scanner(System.in);
        int[] arrayInput = new int[elements];

        for(int i=0;i< arrayInput.length; i++){
            arrayInput[i] = Integer.parseInt(scanner.nextLine());
        }
        return arrayInput;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

}
