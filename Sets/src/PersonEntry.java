import java.util.HashSet;
import java.util.Set;

public class PersonEntry {

    public static void main(String[] args) {
        Person person1=new Person("Nishant",233);
        Person person2=new Person("Krushna",22);
        Person person3=new Person("Rohit",22);
//        Person person7=person3;
        Set<Person> set=new HashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);
//        set.add(person6);
//        set.add(person6);
        for(Person person:set){
            System.out.println(person);
        }
    }

    }


