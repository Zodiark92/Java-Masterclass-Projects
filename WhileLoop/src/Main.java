public class Main {

    public static void main(String[] args) {

        for(int i= 0; i<= 5; i++){
            System.out.println(i);
        }

        int j = 1;
        while(true){
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }
        //DO WHILE LOOP
        int k = 1;
        boolean isReady = false;
        do{
            if(k > 5){
                break;
            }
            System.out.println(k);
            k++;
        } while(isReady);

        System.out.println("*******************");

        int number = 0;
        while(number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");

        }
    }
}
