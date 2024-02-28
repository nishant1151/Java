public class Employees extends Person {
    private int salary;
    private int eid;
    private static int count;

    public Employees(){
       this(0,"no-name","no city",0);
    }
    public Employees(int age,String name,String city ,int salary){
        super(age,name,city);
        this.salary=salary;
        this.eid=generateeid();
    }
    private int generateeid()
    {
        return ++count;

    }

    @Override
    public String toString() {
        return super.toString();
    }
    public boolean equals(Object a){
        Employees p1=(Employees)a;
        return p1.name.equals(this.name) &&    p1.age==this.age && p1.city.equals(this.city) && p1.salary==this.salary;
    }
}
