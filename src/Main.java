//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
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

        ExceptionTester tester = new ExceptionTester(cart);
        System.out.println("no error should be thrown");
        tester.forceThrowsEmptyCartException();
        System.out.println("testing indexoob...");
        tester.forceIndexOutOfBoundsExceptions();

        ExceptionTester emptyCartTester = new ExceptionTester(new Cart());
        System.out.println("error should be thrown");
        emptyCartTester.forceThrowsEmptyCartException();





    }
}