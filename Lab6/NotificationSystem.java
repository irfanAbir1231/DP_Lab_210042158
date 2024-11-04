public class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.send("irfan@gmail.com", "old type of notification 1!");
        sms.send("1907463104", "old type of notification 2!");

        // adding 3rd party postal mail
        PostalMailSystem postalMail = new PostalMailSystem();
        Notification postalMailAdapter = new PostalMailAdapter(postalMail);

        //using same notification interface
        postalMailAdapter.send("irfan, IUT   ", "new message sent 1!");
    }
}