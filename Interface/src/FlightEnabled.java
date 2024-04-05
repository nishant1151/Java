public interface FlightEnabled {
    public static final int a=10;
    void fly();
    void land();
    void takeOff();
    void planeCrash();

    default void engineType(){
        someFunction();
        System.out.println("engine type");
    }

    static void display(){
        System.out.println(a);
    }
    private void someFunction(){
        System.out.println("hello world");
    }



}
