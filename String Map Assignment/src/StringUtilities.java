import java.util.*;

public class StringUtilities {
public static Map countCharacters(String str){

    int temp;

    Map<Character ,Integer> map=new TreeMap<>();

    for(int i=0;i<str.length();i++) {
        if(map.containsKey(str.charAt(i))){
            temp= map.get(str.charAt(i));
            temp++;
            map.replace(str.charAt(i),temp);
        }
        else{
            map.put(str.charAt(i),1);
        }
    }
    return map;
}

public static Map sortCharacters(String str){
    return new TreeMap(countCharacters(str));
}

public static Map sortByNumbers(String str){

    Map<Character,Integer> map=countCharacters(str);
    List list=Arrays.asList(map);
    List l1=new ArrayList<>(list);
    System.out.println(list.get(0).toString());



    return null;
}

}
