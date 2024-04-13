import java.util.*;

public class Main {
    public static void main(String [] args){
        List<String> list =new ArrayList<>();
        list.add("Apple");
        list.add("Mangoes");
        list.add("Banana");
        list.add("Watermelon");

        System.out.println(list);


        Integer[] arr={1,2,3,4,5,6,7};

        List listInt=List.of(arr);
//        listInt.add(12);

        System.out.println (listInt);


        Integer[] arr1={1,2,3,4,5,5,58,86};

        List<Integer> list2=new ArrayList<>();
        list2=Arrays.asList(arr1);
        list2.add(5);
        System.out.println(list2);


        Set<Integer> set=new HashSet(list2);

        for(Integer abc:set){
            System.out.println(abc);
        }






    }
}
