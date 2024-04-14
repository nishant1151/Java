import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String [] args){


        CricketBallPlayer cricketBallPlayer=new CricketBallPlayer(22,"abcd",55);
        CricketBallPlayer cricketBallPlayer1=new CricketBallPlayer(22,"abc",35);
        CricketBallPlayer cricketBallPlayer2=new CricketBallPlayer(22,"asdd",5);
        CricketBallPlayer cricketBallPlayer3=new CricketBallPlayer(22,"zbcd",65);
        CricketBallPlayer cricketBallPlayer4=new CricketBallPlayer(22,"bcd",15);


      List<CricketBallPlayer> teams=new ArrayList<>();
        teams.add(cricketBallPlayer);
        teams.add(cricketBallPlayer1);
        teams.add(cricketBallPlayer2);
        teams.add(cricketBallPlayer3);
        teams.add(cricketBallPlayer4);

//        teams.displayTeam();

        display(teams);


    }

    public static<T> void display(FootBallPlayer<? super Player>l1 ){
        System.out.println(l1);

    }
}
