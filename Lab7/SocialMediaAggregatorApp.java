import java.util.List;

public class SocialMediaAggregatorApp {
    public static void main(String[] args) {
        NotificationAggregator aggregator = new NotificationAggregator();

        aggregator.addAdapter(new TwitterAdapter());
        aggregator.addAdapter(new FacebookAdapter());

        List<Notification> notifications = aggregator.getAllNotifications();
        System.out.println("All Notifications:");
        for (Notification notification : notifications) {
            System.out.println("ID: " + notification.getId() + " Content: " + notification.getContent());
        }

        aggregator.markAsRead("Twitter", "tw1");
        aggregator.deleteNotification("Facebook", "fb2");
    }
}
