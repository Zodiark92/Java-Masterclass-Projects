public class Main {

    public static void main(String[] args) {

        int counter = 4;

        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;

        while(counter <= 20){

            if(isEvenNumber(counter)){
                System.out.println("Even number: " + counter);
                totalEvenNumbers++;
            } else {
                totalOddNumbers++;
            }

            if(totalEvenNumbers == 5){
                break;
            }

            counter++;
        }

        System.out.println("Total even numbers: " + totalEvenNumbers);
        System.out.println("Total odd numbers: " + totalOddNumbers);

    }

    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;
        }

        return false;
    }
}
