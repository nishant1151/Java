public class Minutes_To_Years_and_Days_Calculator {
    public void printYearsAndDays(long minutes){
        if(minutes>0){
            long days=minutes%525600;
            System.out.println(minutes+"min= "+minutes/525600+" y and "+days/1400+" d");


        }
        else {
            System.out.println("invalid input");
        }
    }
}
