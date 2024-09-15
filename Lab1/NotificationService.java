public class NotificationService {
    public static void sendNotification(String message, Rider rider) {
        System.out.println("Sending notification to Rider: " + message);
    }

    public static void sendNotification(String message, Driver driver) {
        System.out.println("Sending notification to Driver: " + message);
    }
}
