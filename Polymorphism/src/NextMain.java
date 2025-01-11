public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Jaws");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("plane");
        plane.watchComedy();

        // test at runtime if the instance is of type Comedy
        Object unknownObject = Movie.getMovie("S", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof  ScienceFiction syfy) { //PATTERN MATCHING
            syfy.watchScienceFiction();
        }
    }
}
