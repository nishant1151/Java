import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Contactlist {
    private List<Contacts>contactList;

    public Contactlist(){
        contactList=new ArrayList<>();
    }
    public void addContacts(Contacts contacts){
        contactList.add(contacts);
    }

    public void addNumber(String name,long number){
      int  count =0;
        while(count!=contactList.size()){
            if(contactList.get(count).getName().equals(name)){
                contactList.get(count).addNumber(number);
            }
            count++;
        }
    }
    public void removeContact( String name){

        Iterator<Contacts> iterator= contactList.iterator();
        while (iterator.hasNext()){
           if(iterator.next().getName().equals(name)){
               iterator.remove();
           }
    }}
    public void removeContact( long number){
    int count=0;
    Iterator<Contacts> iterator=contactList.iterator();
        while(count-1!=contactList.size()){
            Iterator<Long> iterator1=contactList.get(count).getContact().iterator();
            while (iterator1.hasNext()){
                if(iterator1.next()==number){
                    contactList.remove(count);
                }
            }
            count++;
            }

        }

    public void searchContact(String name){
        int count=0;
        while(count!=contactList.size()){
            if (contactList.get(count).getName().equals(name)) {
                System.out.println(contactList.get(count));

            }
            count++;
            }
        }

    public void searchContact( long number) {
        int count = 0;
        Iterator<Contacts> iterator = contactList.iterator();
        while (count  != contactList.size()) {
            Iterator<Long> iterator1 = contactList.get(count).getContact().iterator();
            while (iterator1.hasNext()) {
                if (iterator1.next() == number) {
                    System.out.println(contactList.get(count));
                }
            }
            count++;
        }

    }


    public void displayContacts(){
        contactList.sort(Comparator.comparing(Contacts::getName));
        System.out.println(contactList);
    }

    @Override
    public String toString() {
        return "Contactlist{" +
                "contactList=" + contactList +
                '}';
    }
}
