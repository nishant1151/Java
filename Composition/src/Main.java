public class Main {
    public static void main(String args[]){
        Address address=new Address(101,"yogiraj","balawadhi patha","Pune","maharashtra",411045);
        Person person =new Person(21,"Nishant",address);
        address.setCity("kolhapur");

        System.out.println(person);

}
    }
