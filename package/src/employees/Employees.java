package employees;

<<<<<<< HEAD
public  class Employees {
    protected  String name;
=======
public abstract class Employees {
    protected String name;
>>>>>>> dd1ab6b9541e58157cd90088d17e861f5e5352b8
    protected int eid;
    protected int salary;

    public Employees(int eid,String name,int salary){
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }
<<<<<<< HEAD
//    public  double totalSalary();
=======
    public abstract double totalSalary();
>>>>>>> dd1ab6b9541e58157cd90088d17e861f5e5352b8

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                ", salary=" + salary +
                '}';
    }
}
