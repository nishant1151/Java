import java.io.Serializable;

public class MyThreadUsingInterface  implements Runnable {

    public void run(){
        for(int i=20;i<45;i++){
            System.out.println(i);
        }
    }


}
