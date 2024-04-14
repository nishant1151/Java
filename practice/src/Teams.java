import java.util.HashSet;
import java.util.*;
public class Teams <T extends Player>{
    private List<T> set ;
    public Teams(){
        set=new ArrayList<>();
    }
    public void addPlayers(T players){
        set.add(players);
    }

    public void displayTeam(){
        System.out.println(set);
    }


}
