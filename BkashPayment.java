public class BkashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount, Trip trip) {
        System.out.println("Processing Bkash payment of " + amount);
    }
}

