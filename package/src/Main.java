import developer.Developer;
import employees.Employees;

public class Main {
    public static void main(String[] args){
        Employees employees=new Developer("nishant",552,50000,"abcd");
        call(employees);
    }
    public static void call(Employees employees){
        System.out.println(employees.totalSalary());
    }
}
