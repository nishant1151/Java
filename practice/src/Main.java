import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Scanner sc=new Scanner(System.in);

        System.out.println("enter name");
        String name=sc.next();

        sc.nextLine();

        System.out.println("enter name");
        String name1=sc.nextLine();
        System.out.println(name1);



    }

}
