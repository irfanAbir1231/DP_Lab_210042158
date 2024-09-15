public class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount, Trip trip) {
        System.out.println("Processing Cash payment of " + amount);
    }
}
