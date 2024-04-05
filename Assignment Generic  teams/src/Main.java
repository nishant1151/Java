public class Main {
    public static void main(String[] args){
    CricketPlayers cricketPlayers1=new CricketPlayers("Nishant",7,"batsman");
        CricketPlayers cricketPlayers2=new CricketPlayers("Ztharva",25,"all-rounder");
        CricketPlayers cricketPlayers3=new CricketPlayers("Krushna",30,"baller");
        Teams teams=new Teams("abcd");
        teams.addPlayers(cricketPlayers2);
        teams.addPlayers(cricketPlayers3);
        teams.addPlayers(cricketPlayers1);
        teams.listPlayers();
//        String string=new String("jsdh");
//        teams.addPlayers(string);







    }
}
