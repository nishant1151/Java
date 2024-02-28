public class Person {
    protected int age;
    protected String name;
   protected String city;

    public Person(){
  this(0,"No Name","No city");
    }

    public Person( int age,String name,String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public int getAge(){
    return age;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return "age="+age+" name="+name+" city="+city;
    }

}
