import java.util.ArrayList;
import java.util.List;

public class CricketTeam  {
    private String teamName;
    List<Players> teams=new ArrayList<>();
    public CricketTeam(String teamName){
        this.teamName=teamName;
    }

    public void addPlayers(Players players){
        teams.add(players);
    }
    public void listPlayers(){
        for(Players players:teams ){
            System.out.println(players);

        }    }
}
