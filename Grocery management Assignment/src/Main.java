import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Cart c1=new Cart();
        c1.addToCart();
//        c1.addToCart();

//        c1.addToCart();
        c1.displayCart();
//c1.removeFromCart("bread");
        c1.displayCart();
        System.out.println(c1.bill());
        c1.replaceFromCart("bread","shampoo","shampoo",5);
        c1.displayCart();
    }
}
