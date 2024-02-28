public class Salariedemployee extends Employees{

   private double annualSalary;
   private boolean isRetired;

   public Salariedemployee(){
       this("no name","00-00-0000","00-00-0000",   0);
   }
   public Salariedemployee(String name,String birthDate,String HireDate,double annualSalary){
      super(name,birthDate,HireDate);
      this.annualSalary=annualSalary;
      isRetired=retire();


   }
   public boolean retire(){
      return getAge()>=60;
   }
   public String toString(){
      return "annual salary="+annualSalary+" isretired="+isRetired+super.toString();
   }
   public double collectPay(){
      return annualSalary/12;
   }

}
