public class Speedconverter {

    public long toMilesPerHour(double kilometerperhour){
        double result;
        if(kilometerperhour>0){
           result= kilometerperhour / 1.609344;
           return Math.round(result);
        }
        else{
            return -1;
        }
    }
    public void printConversion(double kilometerperhour){

    if(toMilesPerHour(kilometerperhour)!=-1) {
        System.out.println(kilometerperhour + " km/hr= " + toMilesPerHour(kilometerperhour) + " mi/hr");
    }
    else{
        System.out.println("invalid value");
    }
    }
}
