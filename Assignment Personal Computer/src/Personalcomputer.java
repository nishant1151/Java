public class Personalcomputer extends Product{

    private Monitor monitor;

    private ComputerCase computerCase;

    public Personalcomputer(String companyName, String productName, Monitor monitor, ComputerCase computerCase) {
        super(companyName, productName);
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }


    public void start(){
        computerCase.getMotherboard().loadOs();
        monitor.logo();

    }



    @Override
    public String toString() {
        return "Personalcomputer{" +
                "monitor=" + monitor +
                ", computerCase=" + computerCase +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }

}
