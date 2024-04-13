import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(22, "Nishant");
        Person person2 = new Person(23, "Krushna");
        Person person3 = new Person(21, "Atharva");

        List<Person> personsList = new ArrayList<>();

        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);

        Employees employee1 = new Employees(23, "Nishant", "abcd", 105);
        Employees employee2 = new Employees(23, "Nishant", "abcd", 105);
        Employees employee3 = new Employees(23, "Nishant", "abcd", 105);
        displayList(personsList);


        List<Employees> employeeList = new ArrayList<>();


        System.out.println("*".repeat(85));
        employeeList.add((Employees) employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
//        displayList(employeeList);


        System.out.println("*".repeat(105));
        Developer developer1=new Developer("Nishant",25,"abcd",125,"hello");
        Developer  developer2=new Developer("Atharva",26,"abcd",182,"hello");
        Developer  developer3=new Developer("Krushna",24,"abcd",105,"hello");
        List<Developer> developerList=new ArrayList<>();
        developerList.add(developer1);
        developerList.add(developer2);
        developerList.add(developer3);

//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

//        for(int[]arr1:arr){
//            for(int data:arr1){
//                System.out.println(data);
//            }
//        }

        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=10+j;
            }
        }

        System.out.println(Arrays.deepToString(arr));

//        displayList(developerList);
    }



//    public static void displayList(List<Person>Person){
//        for (Person person1 : Person){
//            System.out.println(person1);
//        }
//    }

    public static void displayList(List<? super Person>person){

        for(Object person1:person){
        if(person1 instanceof Person person2){
            System.out.println(person2.getName());
        }
        }
    }
//    public static <T extends Person> void displayList(List<T> person ){
//        for(Person person1:person){
//            System.out.println(person1);
//        }
//    }
}
