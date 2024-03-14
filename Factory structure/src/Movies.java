import java.util.Locale;

public class Movies {

    public void watchMovie(){

        System.out.println("you are watching "+getClass().getName()+" movie");
    }

    public static Movies objectCreator(String title, String name){
        String str1=title.toLowerCase();
        if (str1.equals("comedymovie")){
            return new Comedymovies(name);
        } else if (str1.equals("action")) {
            return new Action(name);
        }
        else if (str1.equals("scirncwfriction")) {
            return new Scirncefriction(name);
        }
        else {
            return new Movies();
        }
    }

}
