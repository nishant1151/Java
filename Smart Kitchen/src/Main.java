public class Main {
    public static void main(String args[]){
        Refigrator refigrator=new Refigrator();
        Dishwasher dishwasher=new Dishwasher();
        Coffeemaker coffeemaker=new Coffeemaker();
        SmartKitchen smartKitchen=new SmartKitchen(refigrator,dishwasher,coffeemaker);
        smartKitchen.setKitchenState(refigrator.hasWorkToDo(), dishwasher.hasWorkToDo(), false);
    }

}
