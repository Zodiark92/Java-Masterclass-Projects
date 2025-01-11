import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}