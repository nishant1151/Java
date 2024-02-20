public class Number_of_days_in_months {
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
    public int getDaysInMonths(int month ,int year)
    {
        if ((month > 0 && month < 13) && (year > 0 && year < 9999))
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
        else{
            return -1;
        }

    }

}
