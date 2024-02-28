public class Employees extends Person {
    private int eid;
    private static int count;
    private int salary;

    public Employees(){
        this(0,"no-name","no city",0);
    }
    public Employees(Employees e1){
        this(e1.age,e1.name,e1.city,e1.salary);
    }
    public Employees(int age,String name,String city,int salary){
        super(age,name,city);
        this.salary=salary;
        eid=generateEmployeeId();
    }
    private int generateEmployeeId(){
        return ++count;
    }

    public Person retobj(){
        return new Employees();
    }

    @Override
    public boolean validateAge(){
        if (age>10){
            return true;
        }
        return false;
    }
    public boolean equals(Object p1){
        Employees p2=(Employees)p1;
        return (p2.age==this.age) && (p2.name==this.name) ;
    }
    @Over ride
    public String toString() {
        return super.toString()+"eid="+eid+" Salary="+salary;
    }
}
