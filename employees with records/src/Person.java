public class Person {
    protected int age ;
    protected  String name;

    public Person(){
        this(1,"No name");

    }
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
