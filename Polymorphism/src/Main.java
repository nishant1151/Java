public class Main {
    public static void main(String args[]){
//        Employees employees=new Employees(10,"abcd","pune",25000);
//        System.out.println(employees);
//        System.out.println(employees.validateAge());
//   Person person=new Person(8,"das","sdv");
//        System.out.println(person.validateAge());
//      Employees e1 =new Employees();
//        System.out.println(employees.retobj());
//        Employees e3=new Employees((Employees) employees.retobj());
//        System.out.println(e3);
        Person p1=new Person(11,"abc","pune");
        Person p2=new Person(11,"adfc","pune");
        System.out.println(p1.equals(p2));

        Employees e1=new Employees(11,"abc","pune",35646);
        Employees e2=new Employees(11,"abc","pune",35646);
        System.out.println(e2.equals(e1));
    }

}
