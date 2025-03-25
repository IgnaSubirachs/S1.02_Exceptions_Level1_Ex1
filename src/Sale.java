import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }

    public Product getProducts(int i) {
        if(i>= products.size()){
            throw new IndexOutOfBoundsException("Out of the limits");
        }
        return products.get(i);
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


