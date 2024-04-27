public class MyThread extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            try {
//                System.out.println(this.getName());
                Thread.sleep(80);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mythread="+i);
        }
    }

}
