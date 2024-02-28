public class Main {
    public static void main(String args[]){
        Person p1=new Person(25,"abc","pune");
        Employees e1=new Employees(55,"abc","cc",25000);
        Employees e2=new Employees(5,"abc","cc",25000);
        System.out.println(e2.equals(p1));
    }
}
