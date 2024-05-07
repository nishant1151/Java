public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this .age=age;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setAge(){
        this.age=age;
    }
    public int getAge(){
        return age;

    }
    public String getName(){
        return name;
    }


    public boolean equals(Object o){
        if(o !=null){
            if(o instanceof Person person){
                return name.equals(person.name) && age==person.age;
            }
        }
        return false;
    }
    public int hashCode(){
        return age*84/+name.hashCode();
    }


    public int compareTo(Person person){
        return name.compareTo(person.name);
    }

    public String toString(){
        return "name= "+name+" age= "+age;
    }

}
