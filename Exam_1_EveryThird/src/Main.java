public class Main {

    public static void main(String[] args) {

        for(int i = 10; i<= 30; i+=3){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for(int i = 1; i<= 6; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
