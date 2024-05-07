public class Main {
    public static void main(String [] args) {
    MyInterface<String> myInterface=(t1,t2)->t1+t2;
    someFunction(myInterface,"j0;lkm","jnhmbn");


    }
    public static <T> void someFunction(MyInterface<T> myInterface,T t1,T t2){
        System.out.println(myInterface.add(t1,t2));


    }
}

