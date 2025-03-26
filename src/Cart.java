import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }

    public ArrayList<Product> getProducts() {
       // if(i>= products.size()){
         //   throw new IndexOutOfBoundsException("Out of the limits");
        //}
        // return products.get(i);
        return this.products;
    }
    public void addProduct (Product product){
        products.add(product);
    }

    public double calculateTotalPrice() throws EmptyCartException {
        double totalAmount = 0;
        if (products.isEmpty()) {
            throw new EmptyCartException();
        }
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }
}


