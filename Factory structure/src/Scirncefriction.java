public class Scirncefriction extends Movies{
    private String name;

    public Scirncefriction(){
        this("na");
    }
    public Scirncefriction(String name){

        this.name=name;
    }

    public void watchMovie(){
        System.out.println("You are watching "+name+" movie");
    }
}
