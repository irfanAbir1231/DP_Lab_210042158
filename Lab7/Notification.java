public class Notification {
    private String id;
    private String content;
    private boolean isRead;

    public Notification(String id, String content) {
        this.id = id;
        this.content = content;
        this.isRead = false;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public void markAsUnread() {
        this.isRead = false;
    }
}
