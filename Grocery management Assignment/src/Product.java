public class Product {
   private String productName;

   private String companyName;
   private int quantity;
   private int price;

   public Product(){
       this("Na","Na",0,0);
   }
   public Product(String productName,String companyName,int quantity,int price){
       this.companyName=companyName;
       this.productName=productName;
       this.quantity=quantity;
       this.price=price;

   }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int totalPrice(){
       return quantity*price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
