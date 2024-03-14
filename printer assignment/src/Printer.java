public class Printer {
   private int tonnerLevel;
   private int pagesPrinted;

   private boolean duplex;

   public Printer(int tonnerLevel,int pagesPrinted,boolean duplex){
       this.tonnerLevel=tonnerLevel;
       this.pagesPrinted=pagesPrinted;
       this.duplex=duplex;


   }
   public int addTonner(int ink){

       if(tonnerLevel>0 && tonnerLevel<=100 && ink>0 && ink<100) {
           System.out.println(tonnerLevel);

           tonnerLevel = tonnerLevel + ink;
       }
       return tonnerLevel;
   }
   public int printPages(int pages){
       if(tonnerLevel>0 && tonnerLevel<pages){
       if(duplex ){
           pagesPrinted=pages/2;
           if(pages%2!=0){
           ++pagesPrinted;
           }
       }
       else{
           pagesPrinted=pages;
       }
       tonnerLevel=tonnerLevel-pages;
       return pagesPrinted;
   }
       else {
           System.out.println("tonner level low");
           return 0;
       }
   }
}
