public class Employee extends Person {
    private int salary;

    public Employee() {
        this(1,"No-name",00);
    }

    @Override
    public String toString() {
        return "Employee{salary=" + salary+super.toString();
    }




    public Employee(int age, String name, int salary){
        super(age, name);
        this.salary=salary;

    }

}