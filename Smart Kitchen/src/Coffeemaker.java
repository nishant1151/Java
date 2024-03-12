public class Coffeemaker {
    private boolean flag;

    public boolean hasWorkToDo(){
        flag=true;
        return true;
    }
    public  void brewCoffee(){
        if(flag) {
            System.out.println("coffee is ready");
        }else{
            System.out.println("coffee machine is of");
        }  }
}
