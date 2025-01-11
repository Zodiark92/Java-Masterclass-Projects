public class Main {

    public static void main(String[] args) {

        System.out.println("i)");
        print(1);

        System.out.println("ii)");
        print(2);

        System.out.println("iii)");
        print(3);

        System.out.println("iv)");
        print(4);

        System.out.println("v)");
        print(5);

        System.out.println("vi)");
        print(6);

    }

    public static void print(int number) {

        switch (number) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if(j <= i){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 3:
                for(int i = 0; i < 5; i++){
                    for (int j = 0; j < 5; j++){
                        if(j >= 5-i){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("*");
                }
                break;

            case 4:
                int rows = 5;
                int colums = 9;
                for(int i = 0; i< rows; i++){
                    for(int j=0; j< colums; j++){
                        if(j>=(colums/2 - i) && j<=(colums/2 + i)){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 5:
                 rows = 5;
                 colums = 9;
                for(int i = 0; i< rows; i++){
                    for(int j=0; j< colums; j++){
                        if(j>=(colums/2 - i) && j<=(colums/2 + i)){
                            System.out.print(i+1);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 6:
                rows = 5;
                colums = 9;
                for(int i = 0; i< rows; i++){
                    for(int j=0; j< colums; j++){
                        if(j>=(colums/2 - i) && j<=(colums/2 + i)){
                            System.out.print(Math.abs(j-(rows-1))+1);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;


        }

    }

}
