import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
      int data;
      Boolean flag=true;
      LinkedList<Integer> list =new LinkedList<>();
      Scanner sc=new Scanner(System.in);
      do {
        System.out.println("""
              1)Push
              2)Remove
              3)Peak
              4)display
              5)exit""");
        int value=sc.nextInt();
        switch(value){
          case 1:{
            System.out.println("Enter data=");
            data=sc.nextInt();
            list.push(data);
            break;
          }
          case 2:{
            System.out.println(list.peek()+"deleted ");
            list.pop();
            break;
          }
          case 3:{
            System.out.println(list.peek());
            break;
          }
          case 4:{
            System.out.println(list);
            break;
          }
          case 5:{
            flag=false;
            break;
          }
          default:{
            System.out.println("invalid input");
          }
        }
      }while(flag);



    }
}
