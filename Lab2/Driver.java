public class Driver {
    private String id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean availability;

    public Driver(String id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.availability = true;
        this.rating = 0;
    }

    public void acceptRide(Trip trip) {
        if (this.availability) {
            trip.setDriver(this);
            NotificationService.sendNotification("Driver has accepted the ride.", trip.getRider());
        }
    }

    public void rateRider(Rider rider, double rating)
    {

    }

    public void addRating(double rating) {
        this.rating = (this.rating + rating) / 2;
    }

    public void startTrip() {
        System.out.println("Trip started.");
    }

    public void completeTrip(Trip trip) {
        trip.completeTrip();
        NotificationService.sendNotification("Trip completed.", trip.getRider());
    }

}
