public class Main {

    public static void main(String[] args) {

        printSquareStar(13);

    }

    public static void printSquareStar(int number){

        if(number < 5){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= number; i++){ //i=1

            for(int j = 1; j <= number; j++){

                if(j== number){
                    System.out.println("*");
                    break;
                }

                if(i==j || (j == (number - i + 1)) || j==1 || i==1 || i==number){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


        }

    }
}
