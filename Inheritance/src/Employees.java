public class Employees extends Person {
   private int eid;

   protected static int count;
    public int salary;
    public Employees(){
        this(0,"No name","No city",0);

    }
    public Employees(int age,String name,String city,int salary){
        super(age,name,city);
        this.salary=salary;
        this.eid=generateEmployeeId();

    }
    public int generateEmployeeId(){
        return ++count;
    }
    public String toString(){
        return  "eid="+eid+" salary="+salary + " " + super.toString();
    };
}
