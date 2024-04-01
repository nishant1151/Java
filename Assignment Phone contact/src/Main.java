import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag= true;
        boolean flag2=true;
        int count;

        Scanner sc =new Scanner(System.in);
        int choice;
        String name,contact;
        long number;
        Contactlist contactlist=new Contactlist();
        while(flag) {
            System.out.println("""
                    1)Add contact
                    2)Display contact
                    3)Search Contact by Name
                    4)Search contact by number
                    5)Add number
                    6)Delete Contact by name
                    7)delete contact by number
                    8) Exit
                     """);
            System.out.print("Enter your choice");
            choice= sc.nextInt();
            switch (choice){
                case 1:

                    System.out.print("Enter name=");
                    name= sc.next();

                    System.out.print("Enter number=");
                    number= sc.nextLong();
                    Contacts contacts=new Contacts();
                    contacts.addContact(name,number);
                    contactlist.addContacts(contacts);
                    while(flag2){
                        System.out.println("""
                                1)Add number
                                2)Exit
                                """);
                        System.out.println("enter your choice");
                        choice =sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter number");
                                contacts.addNumber(sc.nextLong());
                                break;
                            case 2:
                                flag2=false;
                                break;
                            default:
                                System.out.println("invalid number");
                        }

                    }
                    break;
                case 2:
                    contactlist.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter name=");
                    name=sc.next();
                    contactlist.searchContact(name);
                    break;
                case 4:
                    System.out.print("Enter number=");
                    number=sc.nextLong();
                    contactlist.searchContact(number);
                    break;
                case 5:
                    System.out.print("Enter name=");
                    name=sc.next();
                    System.out.print("Enter number=");
                    number=sc.nextLong();
                    contactlist.addNumber(name,number);
                    break;
                case 6:
                    System.out.println("Enter name");
                    contactlist.removeContact(sc.next());
                    break;
                case 7:
                    System.out.println("Enter number");
                    contactlist.removeContact(sc.nextLong());
                    break;
                case 8:
                    flag=false;
                    break;
                default:
                    System.out.println("invalid number");




            }



        }





















//        Contacts c1=new Contacts();
//        c1.addContact("nishant",9307616997l);
////        System.out.println(c1);
//
//        Contacts c3=new Contacts();
//        c3.addContact("Yash",95242154256l);
////        c3.addNumber(98542585268l);
////        System.out.println(c3);
//
//
//        Contactlist c2=new Contactlist();
//        c2.addContacts(c1);
//        c2.addContacts(c3);
////        System.out.println(c2);
////        c2.removeContact("nishant");
////        c2.removeContact(95242154256l);
////        c2.displayContacts();
//        c2.searchContact("nishant");
//
////
//
////        System.out.println(c2);
//
//
////        ArrayList<Integer> arrayList=new ArrayList<>();
////        arrayList.add(70);
////        arrayList.add(30);
////        arrayList.add(55);
////        arrayList.add(10);
////        arrayList.add(60);
////
////        arrayList.sort(Integer::compareTo);
////
////        System.out.println(arrayList);
//




    }


}
