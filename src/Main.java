import java.sql.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sale cart = new Sale();
        try {
            cart.calculateTotalPrice();
        } catch (EmptyCartException e) {
            System.out.println("Error:" + e.getMessage());
        }


        Product P1 = new Product("Tomatoe", 0.15);
        Product P2 = new Product("Onion", 0.25);
        Product P3 = new Product("PlayStation5", 750.00);
        cart.addProduct(P1);
        cart.addProduct(P2);
        cart.addProduct(P3);


        try {
            double total = cart.calculateTotalPrice();
            System.out.println("Total price of the Cart :" + total);
        } catch (EmptyCartException e) {
            System.out.println("Error:" + e.getMessage());
        }

        try {
            System.out.println(cart.getProducts(2));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());


        }
    }
}