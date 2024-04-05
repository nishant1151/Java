public class CricketPlayers implements Players {
    private String name;
    private int jersyNumber;
    private String position;

    public CricketPlayers(String name,int jersyNumber,String position){
        this.name=name;
        this.jersyNumber=jersyNumber;
        this.position=position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJersyNumber() {
        return jersyNumber;
    }

    public void setJersyNumber(int jersyNumber) {
        this.jersyNumber = jersyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "CricketPlayers{" +
                "name='" + name + '\'' +
                ", jersyNumber=" + jersyNumber +
                ", position='" + position + '\'' +
                '}';
    }
}
