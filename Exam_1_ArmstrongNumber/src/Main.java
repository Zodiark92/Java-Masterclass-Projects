public class Main {

    public static void main(String[] args) {

        for(int i=1; i<= 500; i++){

            if(isArmstrongNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int number){

        int tempNumber = number;
        int sumCubes = 0;

        while(tempNumber / 10 != 0) {
            int digit = tempNumber % 10;
            sumCubes += (digit * digit * digit);
            tempNumber /= 10;
        }

        sumCubes += (tempNumber * tempNumber * tempNumber);

        return (sumCubes == number);

    }
}
