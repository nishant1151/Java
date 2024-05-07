import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person person=new Person("abc",52);
        Person person1=new Person("thj",55);
        Person person2=new Person("def",85);

        List<Person> list=new ArrayList<>();

        list.add(person1);
        list.add(person2);
        list.add(person);

        Collections.sort(list);

        System.out.println(list);

        System.out.println( Collections.binarySearch(list,new Person("ab",5)));



    }
}
