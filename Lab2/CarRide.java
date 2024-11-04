public class CarRide implements RideType {
    @Override
    public double calculateFare(double distance, String timeOfDay) {
        return (distance * 0.5);
    }
}