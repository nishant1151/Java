public class Employees extends Worker{
    protected int empid;
    private static int count=1;
    protected String hireDate;

    public Employees(){
        this("no name","00-00-0000","00-00-0000");

    }
    public Employees(String name,String birthDate,String hireDate){
        super(name,birthDate);
        this.hireDate=hireDate;
        this.empid=generateEid();

    }
    private int generateEid(){
       return count++;
    }

    public void setHireDate(String hireDate){

        this.hireDate=hireDate;

    }
    public String getHireDate(){
        return hireDate;
    }
public String toString(){
        return "empid="+empid+" hire_date="+hireDate+super.toString();
}



}
