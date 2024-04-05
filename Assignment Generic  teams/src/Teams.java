import java.io.LineNumberInputStream;
import java.util.*;

public class Teams<T extends Players> {
    private String teamName;
    private List<T> team=new ArrayList<>();
    public Teams(String teamName){
        this.teamName=teamName;
    }

    public void addPlayers(T players){
        team.add(players);
    }
    public void listPlayersSort(){
        for(T players:team ){

            System.out.println(players.getName());

        }    }
    public void listPlayers(){
        ArrayList arr=new ArrayList();
        team.sort(Comparator.comparing(Players::getName));
        for(T players:team ){
            System.out.println(players.getName());

        }    }
}
