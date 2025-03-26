public class ExceptionTester {
    Cart cart;

    public ExceptionTester(Cart cart) {
        this.cart = cart;
    }

    public void forceThrowsEmptyCartException(){
        try {
            double total = cart.calculateTotalPrice();
            System.out.println("Total price of the Cart :" + total);
        } catch (EmptyCartException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void forceIndexOutOfBoundsExceptions(){
        try {
            System.out.println(cart.getProducts().get(cart.getProducts().size()));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());


        }
    }
}
