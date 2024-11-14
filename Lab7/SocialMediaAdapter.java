import java.util.List;

public interface SocialMediaAdapter {
    List<Notification> fetchNotifications();
    void markNotificationAsRead(String notificationId);
    void deleteNotification(String notificationId);
}
