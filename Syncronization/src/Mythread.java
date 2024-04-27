public class Mythread extends Thread{
    public Person person;



    public Mythread(Person person){
        this.person=person;
    }
    public void run(){
        try {
            Thread.sleep(52);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        person.incrementAge();
//        System.out.println( person.toString());
    }
}
