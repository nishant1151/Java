public class Refigrator {
  private boolean flag ;

    public boolean hasWorkToDo(){
        flag=true;
        return true;
    }
    public  void orderFood(){
        if(flag) {
            System.out.println("food ordered");
        }
    else{
            System.out.println("Refigrator is oof");
        }
    }

}
