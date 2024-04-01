package developer;

import employees.Employees;

public class Tester extends Employees {
    String projectName;

    public Tester(String name, int eid, int salary,String projectName){
        super(eid,name,salary);
        this.projectName=projectName;

    }

    @Override
    public double totalSalary() {
       double hra ,ta ,da;
       hra=salary*10/100;
        da=salary*5/100;
        ta=salary*15/100;
        return salary+hra+da+ta;
    }
}
