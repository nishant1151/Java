public class ComputerCase extends Product{
    private String material;
    private Motherboard motherboard;


    public ComputerCase(String companyName, String productName, String material, Motherboard motherboard) {
        super(companyName, productName);
        this.material = material;
        this.motherboard = motherboard;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
//    public void start(){
//        motherboard.loadOs();
//    }


    @Override
    public String toString() {
        return "ComputerCase{" +
                "material='" + material + '\'' +

                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                ", motherboard=" + motherboard +
                '}';
    }
}
