package employees;

public abstract class Employees {
    protected String name;
    protected int eid;
    protected int salary;

    public Employees(int eid,String name,int salary){
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }
    public abstract double totalSalary();

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                ", salary=" + salary +
                '}';
    }
}
