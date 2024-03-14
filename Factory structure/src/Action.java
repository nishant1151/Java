public class Action extends Movies{
    String name;

    public Action(){
        this("na");

    }
    public Action(String name
    ){
        this.name=name;
    }

        public void watchMovie(){
            System.out.println("You are watching "+name+" movie");
        }

}
