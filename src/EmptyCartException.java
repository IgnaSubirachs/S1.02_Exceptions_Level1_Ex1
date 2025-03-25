public class EmptyCartException extends Exception {
    public EmptyCartException() {
        super("To make sale you must first add products");
    }
}

