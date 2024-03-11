public class Monitor extends Product{
    private int size;
    private String display;


    public Monitor(String companyName, String productName, int size, String display) {
        super(companyName, productName);
        this.size = size;
        this.display = display;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public String getDisplay() {
        return display;
    }

    public void setDisplay(String orientation) {
        this.display = orientation;
    }
    public void logo(){
        System.out.println("Windows");
        System.out.println("welcome");
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", orientation='" + display + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }


}
