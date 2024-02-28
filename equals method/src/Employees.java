public class Employees extends Person{
    private int salary;
    public Employees(){
        this(0,0);
    }
    public Employees(int age,int salary){
        this.age=age;
        this.salary=salary;
    }
//    public boolean equals(Object e){
//        Employees e1=(Employees)e;
//        return e1.age==this.age && e1.salary==this.salary;
//
//    }
    public boolean equals(Object e){
        Employees e1=(Employees)(e);
        return e1.age==this.age && e1.salary==this.salary;
    }
}