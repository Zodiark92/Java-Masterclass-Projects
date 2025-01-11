public class Main {

    public static void main(String[] args) {

        int j = 0;

       for(int i = 33; i<= 126; i++){
           System.out.print((char)i + " ");
           j++;

           if(j==10) {
               System.out.println("");
               j=0;
           }

       }

    }
}
