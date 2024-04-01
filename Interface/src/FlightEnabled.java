public interface FlightEnabled {
    void fly();
    void land();
    void takeOff();

    default void engineType(){
        System.out.println("engine type");
    }

}
