import java.util.ArrayList;
import  java.util.List;
public class Contacts {
    private  String name;
    private List<Long> contactNumber;

    public Contacts(){
        contactNumber=new ArrayList<>();
    }
    public void addContact(String name,long number){
        this.name=name;
        contactNumber.add(number);

    }
    public void addNumber(long number){
        contactNumber.add(number);
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public List getContact(){
        return contactNumber;
    }
    @Override
    public boolean equals(Object o){
        if(o!=null){
            if(o instanceof Contacts contacts){
                return contacts.name.equals(name) && contacts.contactNumber.equals(contactNumber);
            }

        }
        return false;
    }
    @Override
    public String toString(){
        return "name= "+name+"\n contact numbers="+contactNumber;
    }


}
