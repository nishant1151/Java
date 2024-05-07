import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args){

        Person person5=new Person("aishant",23,32222);
        Person person1=new Person("yash",22,34443);
        Person person2=new Person("zohit",12,654554);
        Person person3=new Person("rohit",45,765456);
        Person person4=new Person("kohit",85,10526);

        List<Person> list=new ArrayList<>();
        list.add(person5);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);


        Comparator<Person> comparator=(p1,p2)->{
            if(p1.getAge()==p2.getAge()){
                return 0;
            } else if (p1.getAge()>p2.getAge()) {
                return 1;
            }
            return -1;
        };

        list.stream().filter(person -> person.getAge()>13).map(
                person -> {
                    String string = person.getName().substring(0, 1).toUpperCase() + person.getName().substring(1);
                   person.setName(string);
                    return person;
                }
                )
                .sorted().forEach(System.out::println);


        Comparator<Person> comperator1=(p1,p2)->{
                if(p1.getSalary()>p2.getSalary()){
                    return 1;
            }
            else if(p1.getSalary()==p2.getSalary()){
                return 0;
            }
            return -1;
        };

        list.stream()
                .sorted(comparator)
                .forEach(System.out::println);
        Myinterface myinterface=()-> System.out.println("hello world");
        myinterface.hello();
    }




}
