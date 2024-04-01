import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
     ArrayList <Integer>araylist=new ArrayList<>();
     araylist.add(10);
     araylist.add(20);
     araylist.add(30);
     araylist.add(40);
     araylist.add(50);

        System.out.println(araylist.get(3));


     System.out.println(araylist);

ArrayList newaray=new ArrayList();
    newaray.add(10);
        newaray.add(20);
        newaray.add(30);
        newaray.add(40);
        newaray.add(50);
        newaray.add("hello world");

        someFunction(newaray);

        System.out.println(araylist.size());

        System.out.println(araylist.equals(newaray));





        ArrayList arystr=new ArrayList();

        arystr.add("hello");

        arystr.add("hello");

//        araylist.clear();
        System.out.println(araylist);


    }



    public static void someFunction(ArrayList araylist){

        int sum=0;
        for(int i=0;i<araylist.size();i++){
            if(araylist.get(i) instanceof Integer data){
                sum=sum+data;
            }
            else{
                System.out.println(araylist.get(i));
            }
        }
        System.out.println(sum);
    }
}
