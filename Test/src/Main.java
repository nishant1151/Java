import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void  main(String [] args){
        List<Person>personList=new LinkedList<>();
        Person person=new Person("zishant",24);
        Person person1=new Person("ahul",85);
        Person person2=new Person("harsh",84);

        personList.add(person2);
        personList.add(person);
        personList.add(person1);
        Collections.sort(personList,new ageComperator());
        System.out.println(personList);
    }
}
