public class Developer extends Employees{
   private String projectName;

   public Developer(String name,int age,String companyName,int eid,String projectName){
       super(age,name,companyName,eid);
       this.projectName=projectName;
   }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "projectName='" + projectName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
