import java.net.NetworkInterface;

public class Main {
    public static void main(String []args){
        MyThreadOne myThreadOne=new MyThreadOne();
        myThreadOne.start();
        MyThreadOne myThreadOne1=new MyThreadOne();
        myThreadOne1.start();


        MyThreadUsingInterface myThreadUsingInterface= new MyThreadUsingInterface();

        Thread thread=new Thread(myThreadUsingInterface);
        thread.start();

        System.out.println("Code Ended");
    }

}
