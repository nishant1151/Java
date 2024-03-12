public class SmartKitchen {

    private Refigrator refigrator;
    private Dishwasher dishwasher;
    private Coffeemaker coffeemaker;

   public SmartKitchen(Refigrator refigrator,Dishwasher dishwasher,Coffeemaker coffeemaker){
       this.refigrator=refigrator;
       this.dishwasher=dishwasher;
       this.coffeemaker=coffeemaker;

   }
   public void setKitchenState(boolean ref,boolean dish,boolean coffee){
       if(ref){
           refigrator.orderFood();
       }
       if(dish){
           dishwasher.doDishes();
       }
       if(coffee){
           coffeemaker.brewCoffee();
       }
   }
   public void doKitchen(){
       refigrator.orderFood();
       dishwasher.doDishes();
       coffeemaker.brewCoffee();


   }



}
