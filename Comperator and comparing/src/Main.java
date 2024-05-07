import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        Person person = new Person("zishant", 24);
        Person person1 = new Person("ahul", 85);
        Person person2 = new Person("harsh", 84);

        personList.add(person2);
        personList.add(person);
        personList.add(person1);
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person person1, Person person2) {
                if (person1.getAge() == person2.getAge()) {
                    return 0;
                } else if (person1.getAge() > person2.getAge()) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println(personList);

        
    }
}