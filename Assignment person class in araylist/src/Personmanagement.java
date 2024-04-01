import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personmanagement {
    private List<Person> personList=new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
        System.out.println("Person added");
    }
    public void removePerson(String name,int age){
Person person=new Person(name,age);
         personList.remove(person);

        }



    public void display(){
        System.out.println(personList);
    }
    public void removeFromIndex(String name,int age){
       int count=0;
       while(personList.size()!=count){
           if(personList.get(count).getName().equals(name) &&personList.get(count).getAge()==age){
               personList.remove(count);
           }
           count++;
       }


    }
    public boolean present(String name,int age){
        Person person=new Person(name,age);
        return personList.contains(person);
    }
}
