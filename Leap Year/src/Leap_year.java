public class Leap_year {
    public boolean isLeapYear(int year){
        if(year>0 && year<9999){
            if(year%400==0  || (year%4==0 && year%100!=0)){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
                
 