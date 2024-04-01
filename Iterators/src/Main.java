import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){

        ArrayList arylist=new ArrayList();

        arylist.add(10);
        arylist.add(20);
        arylist.add(30);
        arylist.add(40);
        arylist.add(50);

        Iterator<Integer>iterator=arylist.iterator();
        int i=0;
        while(iterator.hasNext()){

            System.out.println(iterator.next());
            arylist.set(i,25*i);
            i++;

        }

        System.out.println(arylist);


        ListIterator<Integer> l1=arylist.listIterator();
        l1.next();
        l1.add(100);
        System.out.println(arylist);
        System.out.println(l1.next());

    }
}
