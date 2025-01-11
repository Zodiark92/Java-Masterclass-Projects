public class Main {

    public static void main(String[] args) {

        System.out.println("125 sum digits: " + sumDigits(125));
        System.out.println("1000 sum digits: " + sumDigits(1000));
        System.out.println("1356 sum digits: " + sumDigits(1356));
        System.out.println("6 sum digits: " + sumDigits(6));
    }

    public static int sumDigits(int number){

        if(number < 0){
            return -1;
        }

        int sum = 0;
        int n = 0;

        while(true){

            if(number / 10 == 0){
                sum += number;
                break;
            }

            //125 -> n=5, sum = 5, number = 12
            //12 -> n=2, 7, number = 1
            //1 -> n=1,

            //1000 -> n=0, sum = 0, number = 100
            //100 -> n= 0, sum = 0, number = 10
            //10 -> n=0, sum = 0, number = 1;

            n = number % 10;
            sum += n;
            number = number / 10;

        }

        return sum;
    }
}
