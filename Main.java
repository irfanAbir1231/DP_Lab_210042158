public class Main {
    public static void main(String[] args) {
        //Ride Booking
        PaymentMethod cash = new CashPayment();
        Rider rider = new Rider("1", "Abir", "gulistan", cash);

        RideType rideType = new CarRide();
        rider.requestRide("iut", "uttara", rideType);

        // Payment
        Trip trip = new Trip("iut", "uttara", rideType);
        rider.makePayment(trip);

        // Driver accepts and completes the ride
        Driver driver = new Driver("1", "abir", "Car", "mirpur");
        driver.acceptRide(trip);
        driver.startTrip();
        driver.completeTrip(trip);

        // Rating System
        rider.rateDriver(driver, 5.0);
        driver.rateRider(rider, 4.5);
    }
}
