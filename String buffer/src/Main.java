public class Main {
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("hello");
        str.append(" world");
        System.out.println(str);

        StringBuilder str1= new StringBuilder("Hello");
        str1.append(" World");
        System.out.println(str1);
    }
}
