public class Main {
    public static void main(String[] args){
Person p1=new Person("nishant",10);
        Person p2=new Person("yash",11);
        Person p3=new Person("om",10);
Personmanagement pp=new Personmanagement();
pp.addPerson(p1);
pp.addPerson(p2);
pp.addPerson(p3);
pp.display();
pp.removePerson("nishant",10);
pp.display();
        System.out.println(pp.present("nishant",10));
    }
}
