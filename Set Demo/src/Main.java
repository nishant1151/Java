import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(30, "Abcd");
        Person person2 = new Person(21, "xyz");
        Person person3 = new Person(25, "mno");
        Person person4 = new Person(21, "Abcd");
//        Person person5=person1;

        Map<String, Integer> set = new HashMap<>();

        set.put("abcd",10);
        set.put("abd",20);
        set.put("acd",10);
        set.put("abcd",10);
        System.out.println(set);

        
    }



}
