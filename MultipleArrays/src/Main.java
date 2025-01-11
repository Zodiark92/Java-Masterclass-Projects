import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[5][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("Array's length: " + array2.length);

        for(int[] outer : array2){ //outer -> each array nested
            System.out.println(Arrays.toString(outer));
        }

        for(int i=0;i < array2.length;i++){
            var innerArray = array2[i];
            for(int j=0; j< innerArray.length;j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("***************************");

        for(var outer : array2) {
            for(var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("*************************");

        System.out.println(Arrays.deepToString(array2));

        System.out.println("*************************");

        for(int i=0;i < array2.length;i++){
            var innerArray = array2[i];
            for(int j=0; j< innerArray.length;j++){
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(array2));

        System.out.println("*************************");

        //MULTIDIMENSIONAL ARRAYs

        array2[0] = new int[] {30, 20, 50};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        anyArray[0] = new String[] {"a", "b", "c"};

        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"4", "5"},
                {"6", "34", "7"}
        };

        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2];

      //  anyArray[2] = "hello"; it generates exception at the deepToString

        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
                System.out.println("Element type = " + element.getClass().getSimpleName());
                System.out.println("Element toString = " + element);
                System.out.println(Arrays.deepToString((Object[]) element)); // it needs here an array, if it is passed an element it breaks
        }
    }
}