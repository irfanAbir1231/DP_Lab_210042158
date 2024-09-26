public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver driver;
    private Rider rider;

    public Trip(String pickupLocation, String dropOffLocation, RideType rideType) {
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = "Pending";
        this.fare = rideType.calculateFare(10, "day"); // Example distance of 10 km
    }

    public void assignDriver() {

    }

    public void completeTrip() {
        this.status = "Completed";
    }

    public double getFare() {
        return fare;
    }

    public Rider getRider() {
        return rider;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
