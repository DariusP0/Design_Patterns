public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Customer wants to pay with a credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Customer wants to pay with PayPal
        cart.setPaymentStrategy(new CashPayment("example@example.com"));
        cart.checkout(50);
    }
}
