import java.sql.SQLException;

public class EcxeptionHandling {

    public static void uncheckedExceptions(int a,int b){


        try{
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("hello");

    }

    public static void checkedExceptions(){
//        Thread.sleep(55788);
        try{
            Thread.sleep(5000);
            NullPointerException nullPointerException=new NullPointerException();
            throw nullPointerException;

        }catch(Exception e){
            e.printStackTrace();


        }
        System.out.println("Hello world");

    }
}
