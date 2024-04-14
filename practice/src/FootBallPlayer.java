import java.text.FieldPosition;

public class FootBallPlayer implements Player {
    private String name;
    private int age;
    private int gercyNumber;


public FootBallPlayer(){
    this(0,"na",0);
}
    public FootBallPlayer(int age,String name,int gercyNumber){
        this.age=age;
        this.name=name;
        this.gercyNumber=gercyNumber;
    }
    @Override
    public String getname() {
        return  name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGercyNumber() {
        return gercyNumber;
    }

    public void setGercyNumber(int gercyNumber) {
        this.gercyNumber = gercyNumber;
    }

    public int hashCode(){
   int  result=age*gercyNumber+name.hashCode();
    return result;

    }
    public boolean equals(Object o){
    if(o!=null){
    if(o instanceof FootBallPlayer footBallPlayer){
        return footBallPlayer.gercyNumber==gercyNumber && footBallPlayer.name.equals(name) && footBallPlayer.age==age;
    }
    }
    return false;
    }

    @Override
    public String toString() {
        return "FootBallPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gercyNumber=" + gercyNumber +
                '}';
    }
}
