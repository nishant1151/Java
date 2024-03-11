public class Main {
    public static void main(String args[]){
        Motherboard motherboard=new Motherboard("Hp","monitor",8,500,"i5");
        ComputerCase computerCase=new ComputerCase("Hp","computer case","steel",motherboard);
        Monitor monitor=new Monitor("hp","monitor",55,"colour");
Personalcomputer personalcomputer=new Personalcomputer("Hp","computer",monitor,computerCase);
        System.out.println(personalcomputer);
        personalcomputer.start();
    }

}
