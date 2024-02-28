
public class Worker{
   protected String name;
    protected String birthDate;
    protected String endDate;



    public Worker(){

        this("No name","00-00-0000");
    }
    public Worker(String name,String birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setBirthDate(String birthDate){

        this.birthDate=birthDate;
    }

    public String getName(){
        return name;
    }
    public String getBirthDate(){

        return birthDate;
    }
    public String getEndDate(){

        return endDate;
    }
    public int getAge(){

        return 2024-Integer.parseInt(birthDate.substring(6));
    }
    public void terminate(String endDate){

        this.endDate=endDate;
    }
    public double collectPay(){

        return 0;
    }

    public String toString(){
        return "name="+name+" birthdate="+birthDate+"end date="+endDate;
    }
}
