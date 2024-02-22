import java.util.Random;

public class Person {
    protected int age;
    protected  String name;
    protected String city;

    public Person(){
        this(0,"No name","no city");

    }
    public Person(int age,String name,String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }

    public boolean validateAge(){
        if(age>0){
            return true;
        }
        return false;
    }


public boolean validateAge(int age){
        if(this.age>age){
            return true;
        }
        return false;

}

public boolean equals(Object p1){
    Person p2=(Person)p1;
        return (p2.age==this.age) && (p2.name==this.name) ;
}
public Person retobj(){
        return new Person();
    }
    public String toString(){
        return "age="+age+" name="+name+" city="+city;

    }}


