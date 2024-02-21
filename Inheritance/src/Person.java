public class Person {
    protected  int age;
    protected  String name;
    protected String city;

  public Person(){
      this(0,"no name","no city");
  }
  public Person(int age,String name,String city){
      this.age=age;
      this.name=name;
      this.city=city;

  }
  public void setName(String name){
      this.name=name;
  }
  public void setcity(String city){
      this.city=city;
  }
  public void setAge(int age){
      this.age=age;
  }

  public int getAge(){
      return age;
  }
  public String getCity(){
      return city;
  }
  public String getName(){
      return name;
  }


  public String toString(){
      return "Name="+name+" Age="+age+" city="+city;
  }


}
