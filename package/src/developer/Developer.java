package developer;

import employees.Employees;

public class Developer extends Employees {
    String projectName;

    public Developer(String name,int eid,int salary,String projectName){
        super(eid,name,salary);
        this.projectName=projectName;

    }

<<<<<<< HEAD
//    @Override
=======
    @Override
>>>>>>> dd1ab6b9541e58157cd90088d17e861f5e5352b8
    public double totalSalary() {
       double hra ,ta ,da;
       hra=salary*15/100;
        da=salary*10/100;
        ta=salary*20/100;
        return salary+hra+da+ta;
    }
}
