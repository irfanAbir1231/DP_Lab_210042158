class PostalMailAdapter implements Notification {
    private PostalMailSystem postalMailSystem;

    public PostalMailAdapter(PostalMailSystem postalMailSystem) {
        this.postalMailSystem = postalMailSystem;
    }
    @Override
    public void send(String receiver, String message) {
        String[] details = receiver.split(",");
        String name = details[0].trim();
        String address = details[1].trim();
        postalMailSystem.sendPostalMail(name, address, message);
    }
}