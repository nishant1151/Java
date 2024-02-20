//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String args[]){

       int number=1;
       char abc='w';

       char aa='s';

       switch(abc){
           case 'h':
               System.out.println("hello");
               break;
           case 'i':
               System.out.println("world");
               break;
           case 'w':
               System.out.println("welcome");
               break;
           case 'b':
               System.out.println("bye");
               break;
           default:
               System.out.println("invalid number");

       };

    int result= switch(number)
       {
       case 1 -> 1;
       case 2-> 2;
       case 3-> 3;
       default ->4;

       };
       System.out.println(result);


      int res= switch(number){
          case 1:
              System.out.println("hello");
              yield 1;

          case 2:
              System.out.println("bye");
              yield 2;
          default:
              System.out.println("invalid");
              yield -1;

      };
       System.out.println(res);
   }
    }
