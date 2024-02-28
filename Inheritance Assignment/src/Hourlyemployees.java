public class Hourlyemployees extends  Employees {
    private double hourlyPayRate;
    private int hoursPerDay;


    public Hourlyemployees(){
        this("no name","00-00-0000","00-00-0000",0);

    }
    public Hourlyemployees(String name,String birthDate,String HireDate,double hourlyPayRate){
        super(name,birthDate,HireDate);
        this.hourlyPayRate=hourlyPayRate;
    }
    public String toString()
    {
        return "hourly pay rate="+hourlyPayRate+super.toString();

    }
    public int hoursPerDay(int hours){
        return hours;
    };



    public double collectPay(){
        return hourlyPayRate*hoursPerDay*30;
    }

    public double getDoublePay(){
        return hourlyPayRate*2;
    }



}