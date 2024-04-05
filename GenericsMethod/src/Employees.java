public class Employees extends Person{
    protected String companyName;
    protected int eid;

   public Employees(int age,String name,String companyName,int eid){
       super(age, name);
        this.companyName=companyName;
        this.eid=eid;
   }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "companyName='" + companyName + '\'' +
                ", eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
