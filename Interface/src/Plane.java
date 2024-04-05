public class Plane implements FlightEnabled {
    PlaneDesign planeDesign;
    public void fly(){
        System.out.println("plane is flying");
    }
    public void land(){
        System.out.println("flight has landed");

    }
    public void takeOff(){
        System.out.println("plane take of");
    }
    public void planeCrash(){
        System.out.println("open emergency doors");
        System.out.println("call Helpline");
    }
}
