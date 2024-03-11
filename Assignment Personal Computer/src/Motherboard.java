public class Motherboard extends Product{
    private int ram;
    private int rom;
    private String processor;


    public Motherboard(String companyName, String productName, int ram, int rom, String processor) {
        super(companyName, productName);
        this.ram = ram;
        this.rom = rom;
        this.processor = processor;
    }


    public int getRam() {
        return ram;
    }



    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


public void loadOs(){
    System.out.println("Os loaded");
}


    public String toString() {
        return "Motherboard{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", processor='" + processor + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }


}
