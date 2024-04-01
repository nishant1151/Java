import java.util.*;

public class Cart {
  private List<Product> cart=new ArrayList<>();

    public  void addToCart(){
        Scanner sc=new Scanner(System.in);
        String productName;
        String  companyName;
        int quantity;

        System.out.println("""
                1)bread
                2)shampoo
                3)wheat
                4)milk
                5)shampoo;
                """);
        System.out.print("enter Product Name=");
        productName=sc.nextLine();
        System.out.print("enter Company Name=");

        companyName= sc.nextLine();
        System.out.print("enter quantity=");
        quantity= sc.nextInt();

        switch(productName){
            case "bread":
                Product bread=new Product(productName,companyName,quantity,50);
                cart.add(bread);
                break;
            case "Milk":
                Product Milk=new Product(productName,companyName,quantity,100);
                cart.add(Milk);
                break;
            case "Wheat":
                Product wheat=new Product(productName,companyName,quantity,150);
                cart.add(wheat);
                break;
            case "Soap":
                Product soap=new Product(productName,companyName,quantity,75);
                cart.add(soap);
                break;
            case "shampoo":
                Product shampoo=new Product(productName,companyName,quantity,185);
                cart.add(shampoo);
                break;
            default:
                System.out.println("invalid input");
}}
public  int bill(){
        int sum =0;
    Iterator<Product> iterator=cart.iterator();
    while(iterator.hasNext()){
        sum=sum+iterator.next().totalPrice();
    }

    return sum;
}
public void removeFromCart(String productName){
//    Iterator<Product> iterator=cart.iterator();
    ListIterator<Product>iterator= cart.listIterator();
    while(iterator.hasNext()){
        if(iterator.next().getCompanyName().equals( productName)){
            iterator.remove();
        }

    }}

    public void replaceFromCart(String productName,String newProductName,String companyName,int quantity){
//    Iterator<Product> iterator=cart.iterator();
        ListIterator<Product>iterator= cart.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getCompanyName().equals( productName)){
                iterator.next().setProductName(newProductName);
                iterator.next().setCompanyName(companyName);
                iterator.next().setQuantity(quantity);
            }

        }





}
public  void displayCart(){
    System.out.println(cart);
}
}
