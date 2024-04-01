import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){

        Address a1=new Address(101,"abcd");
        Person p1= new Person(20,"aa",a1);
        Person p2= new Person(22,"bb",a1);
        Person p3= new Person(24,"cc",a1);
        Person p4= new Person(26,"dd",a1);
        Person p5= new Person(23,"ee",a1);

        Person[] pp=new Person[5];
        pp[0]=p1;
        pp[1]=p5;
        pp[2]=p2;
        pp[3]=p3;
        pp[4]=p4;

        pp[4].getAddress().setFlatNo(55);
        System.out.println(Arrays.toString(pp));


}
}
