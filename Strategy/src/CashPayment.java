public class CashPayment implements PaymentStrategy {
    private String email;

    public CashPayment(String email) {
        this.email = email;
    }
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " with cash ");
    }
}