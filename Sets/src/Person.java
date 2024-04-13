public class Person {
    private int age;
    private String name;

  public  Person(String name,int age){
      this.name=name;
      this.age=age;


  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    public boolean equals(Object object){
//      if(object!=null){
//          if(object instanceof Person person){
//              return person.age==age && name.equals(person.name);
//          }
//      }
//      return false;
//    }


    @Override
    public boolean equals(Object object) {
        System.out.println("Called"+name);
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Person person = (Person) object;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = age;
//        result = 31 * result + name.hashCode();
        return result/5;
    }



    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

