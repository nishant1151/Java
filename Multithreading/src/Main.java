public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println(myThread.getId());

    //        Mythreadsec mythreadsec=new Mythreadsec();
    //        mythreadsec.start();
    //
        System.out.println("end program");
    }
}
