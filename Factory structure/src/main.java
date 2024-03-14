public class main {
    public static void main(String args[]){
        callmovie(Movies.objectCreator("action","john wic"));

    }

    public static void callmovie(Movies movie){
        if(movie instanceof Comedymovies comedy){
            comedy.watchMovie();
        } else if (movie instanceof Action action) {
            action.watchMovie();
        }

    }


}
