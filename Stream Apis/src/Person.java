public class Person implements Comparable<Person>{
    private int age;
    private String name;
    private int salary;

    public Person(String name,int age,int salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary=salary;

    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public int compareTo(Person p1){
        return name.compareTo(p1.getName());
    }

}
