import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> strList=new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Mango");
        strList.add("Apple");
        strList.add("Watermelon");
        strList.add("Grapes");
        strList.add("oranges");
        strList.add("Apple");
        strList.add("pomogranet");
        strList.add("chiku");
        strList.add("Apple");
        strList.add("pineapple");
        strList.add("Tomato");
        strList.add("Apple");
        System.out.println(strList);
        System.out.println(strList.contains("oranges"));


        List<String> list2=new ArrayList<>();

        list2.add("kmh");


//        strList.removeAll(list2);
//
//        System.out.println(strList);

                strList.retainAll(list2);

            System.out.println(strList);

    }
}
