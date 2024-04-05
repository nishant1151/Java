import java.util.Comparator;

public class Person {
   protected String name;
   protected int age;

   public Person(){
   this(0,"na");
   }
   public Person(int age,String name){
       this.age=age;
       this.name=name;

   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;

   }
   public void setAge(int age){
       this.age=age;
   }
   public void setName(String name){
       this.name=name;
   }
//   public String toString(){
//       return "name="+name+"\n"+"age="+age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
