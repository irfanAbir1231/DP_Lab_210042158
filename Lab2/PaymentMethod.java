public interface PaymentMethod {
    void processPayment(double amount, Trip trip);
}
