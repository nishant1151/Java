import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int data;
        Boolean flag=true;
        LinkedList<Integer> list =new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("""
              1)Add 
              2)Remove
              3)display
              4)stop""");
            int value=sc.nextInt();
            switch(value){
                case 1:{
                    System.out.println("Enter data=");
                    data=sc.nextInt();
                    list.offer(data);
                    break;
                }
                case 2:{
                    System.out.println(list.peek()+"deleted ");
                    list.poll();
                    break;
                }

                case 3:{
                    System.out.println(list);
                    break;
                }
                case 4:{
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
