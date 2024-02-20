public class Employee_details {
    String name;
    String year_of_joining;
    int salary;
    String address;
    public Employee_details(String name,String year_of_joining,int salary,String address){
        this.name=name;
        this.year_of_joining=year_of_joining;
        this.salary=salary;
        this.address=address;
    }

  public void  displayHeader(){
      System.out.println("Name\t\t\t\t Year of joining\t\t\t\t Address");
    
   }
   public void displayDetails(){

        System.out.println(name+"\t\t\t\t\t "+year_of_joining+"\t\t\t\t\t\t "+address);
   }
}
