public final class Person {
    private final int age;
    private final String name;
    private final Address address;

//    public Person(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
    public Person(int age,String name,Address address){
        this.age=age;
        this.name=name;
        //this.address = address;
        this.address=new Address(address.getFlatNumber(),address.getBuildingName(),address.getStreetName(),address.getCity(),address.getState(),address.getPincode());
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
        //return address;
        return new Address(address.getFlatNumber(), address.getBuildingName(), address.getStreetName(), address.getCity(), address.getState(), address.getPincode());
    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setAddress(Address address){
//        this.address=address;
//    }
public String toString(){
        return "age="+age+" Name="+name+" Address="+address;
}

}
