import java.util.ArrayList;
import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {
    @Override
    public List<Notification> fetchNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("tw1", "New Twitter like!"));
        notifications.add(new Notification("tw2", "New Twitter retweet!"));
        return notifications;
    }

    @Override
    public void markNotificationAsRead(String notificationId) {
        System.out.println("Twitter: Marked notification " + notificationId + " as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleted notification " + notificationId);
    }
}
