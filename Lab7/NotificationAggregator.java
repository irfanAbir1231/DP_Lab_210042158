import java.util.ArrayList;
import java.util.List;

public class NotificationAggregator {
    private List<SocialMediaAdapter> adapters;

    public NotificationAggregator() {
        adapters = new ArrayList<>();
    }

    public void addAdapter(SocialMediaAdapter adapter) {
        adapters.add(adapter);
    }

    public List<Notification> getAllNotifications() {
        List<Notification> allNotifications = new ArrayList<>();
        for (SocialMediaAdapter adapter : adapters) {
            allNotifications.addAll(adapter.fetchNotifications());
        }
        return allNotifications;
    }

    public void markAsRead(String platformId, String notificationId) {
        for (SocialMediaAdapter adapter : adapters) {
            if (adapter instanceof TwitterAdapter && platformId.equals("Twitter")) {
                adapter.markNotificationAsRead(notificationId);
            } else if (adapter instanceof FacebookAdapter && platformId.equals("Facebook")) {
                adapter.markNotificationAsRead(notificationId);
            }
        }
    }

    public void deleteNotification(String platformId, String notificationId) {
        for (SocialMediaAdapter adapter : adapters) {
            if (adapter instanceof TwitterAdapter && platformId.equals("Twitter")) {
                adapter.deleteNotification(notificationId);
            } else if (adapter instanceof FacebookAdapter && platformId.equals("Facebook")) {
                adapter.deleteNotification(notificationId);
            }
        }
    }
}
