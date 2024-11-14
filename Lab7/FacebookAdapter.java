import java.util.ArrayList;
import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter {
    @Override
    public List<Notification> fetchNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("fb1", "New Facebook comment!"));
        notifications.add(new Notification("fb2", "New Facebook like!"));
        return notifications;
    }

    @Override
    public void markNotificationAsRead(String notificationId) {
        System.out.println("Facebook: Marked notification " + notificationId + " as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Facebook: Deleted notification " + notificationId);
    }
}
