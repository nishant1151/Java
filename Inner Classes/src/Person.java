public class Person {
    private String name;
    private int age;

    Person(){
        this("na", 0);
    }
    Person(String name,int age){

        this.age=age;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  static class Abcd {
     private long number;
     private String simCard;
     Abcd(){
         this(0,"na");
     }
     Abcd(long number,String simCard){
         this.number=number;
         this.simCard=simCard;

     }
    


        @Override
        public String toString() {
            return "Abcd{" +
                    "number=" + number +
                    ", simCard='" + simCard + '\'' +
                    '}';
        }
    }

    public Abcd myClass(String simCard,long number){
      return new Abcd(number, simCard);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
