public class Dishwasher {
    private boolean flag;

    public boolean hasWorkToDo(){
        flag=true;
        return true;
    }
    public  void doDishes(){
        if(flag){
        System.out.println("washing dishes done");
    }
    else{
            System.out.println("dishwasher is of");
        }}
}
