public class Rider {
    private String id;
    private String name;
    private String location;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, String location, PaymentMethod paymentMethod) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.preferredPaymentMethod = paymentMethod;
        this.rating = 0;
    }

    public void requestRide(String pickupLocation, String dropOffLocation, RideType rideType) {
        Trip trip = new Trip(pickupLocation, dropOffLocation, rideType);
        trip.assignDriver();
        NotificationService.sendNotification("Ride request confirmed!", this);
    }

    public void rateDriver(Driver driver, double rating) {
        driver.addRating(rating);
    }

    public void makePayment(Trip trip) {
        preferredPaymentMethod.processPayment(trip.getFare(), trip);
    }

}
