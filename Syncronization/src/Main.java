public class Main {
    public static void main(String [] args){
        Person person=new Person(10,"flkmv");

        Mythread mythread=new Mythread(person);
        Mythread mythread1=new Mythread(person);
        Mythread mythread2=new Mythread(person);
        Mythread mythread3=new Mythread(person);


        mythread.start();
        mythread1.start();
        mythread2.start();

        mythread3.start();

    }
}
