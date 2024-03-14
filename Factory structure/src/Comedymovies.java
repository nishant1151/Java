public class Comedymovies extends Movies {
    private String name;

    public Comedymovies(String name){


        this.name=name;

    }

    public void watchMovie(){
    System.out.println("You are watching "+getClass().getName()+" movie");
        System.out.println("You are watching "+name+" movie");
    }

}
