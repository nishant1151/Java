public class Product {
   protected String companyName;
    protected String productName;

    protected  int price;
    public Product(){
        this("na","na");
    }

    public Product(String companyName, String productName) {
        this.companyName = companyName;
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
