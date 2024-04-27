public class MyThreadOne extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            try{Thread.sleep(250);
                System.out.println(this.getName());
            System.out.print(i);

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
