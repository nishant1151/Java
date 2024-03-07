import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String args[]){
        String str="Hello";
        System.out.println(str.startsWith("l",3));
        System.out.println(str.startsWith("l"));
        System.out.println(str.substring(3));
        System.out.println(str.indexOf("l",3));
        System.out.println(str.compareTo("Hello"));
        Date date=new Date();
        System.out.println(date);
        Calendar c1=new GregorianCalendar();
        System.out.println(c1.getTime());
        c1.set(2021,12,22);
        System.out.println(c1.g);

//        System.out.println(str.);


    }
}
