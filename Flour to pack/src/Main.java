public class Main {
    public  static void main(String args[]){
        System.out.println(tolowercase("hello"));
    }


    public static String tolowercase(String str){
        char arr[]=str.toCharArray();
        int len =arr.length;
        arr[len-1]=(char)(arr[len-1]-32);
        String str1= new String(arr);
        return str1;
    }
}
