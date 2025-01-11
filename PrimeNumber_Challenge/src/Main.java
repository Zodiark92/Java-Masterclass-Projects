public class Main {

    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//
//        System.out.println("7 is " + (isPrime(7) ? "" : "NOT ") + "a prime number");
//        System.out.println("18 is " + (isPrime(18) ? "" : "NOT ") + "a prime number");

        printPrimeNumbers(10, 50);

    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return (wholeNumber==2);
        }

        for(int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }

    public static void printPrimeNumbers(int min, int max){

        int counter = 0;

        for(int n = min; n <= max; n++){
            if(isPrime(n)){
                System.out.println("Prime number found: " + n);
                counter++;
            }

           if(counter == 3)
               break;
        }
    }
}
