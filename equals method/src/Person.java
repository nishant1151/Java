public class Person {

   protected int age;

   public Person(){
       this(0);
   }
   public Person(int age){
       age=this.age;
   }
@Override
public boolean equals(Object p){
      Employees e1 =(Employees)p;
      return e1.age==this.age;
   }
   }

