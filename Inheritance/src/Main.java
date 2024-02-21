public class Main {
    public static void main(String args[]){
        Person person =new Person();
        System.out.println(person);

        Employees employees=new Employees(10,"abc","pune",684765);
        System.out.println(employees);

        Employees employees1=new Employees(10,"abc","pune",684765);
        System.out.println(employees1);

        Employees employees2=new Employees(10,"abc","pune",684765);
        System.out.println(employees2);
    }
}
