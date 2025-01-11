import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randomNumbers = generateRandomArray(10);
        System.out.println(Arrays.toString(randomNumbers));

     //   int[] sortedArray = sortArrayWithSort(randomNumbers);
          int[] sortedArray = sortArrayFull(randomNumbers);

        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] generateRandomArray(int size){

        Random random = new Random();
        int[] randomNumbers = new int[size];

        for(int i=0; i<randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(100);
        }

        return randomNumbers;
    }
    public static int[] sortArrayWithSort(int[] array){

        int[] arrayToSort = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayToSort);

        int[] sortedArray = new int[array.length];


        for(int i= 0; i< arrayToSort.length; i++){
            sortedArray[i] = arrayToSort[arrayToSort.length -1 -i];
        }
        return sortedArray;
    }

    public static int[] sortArrayFull(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0; i < sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
        }
        return sortedArray;
    }

}