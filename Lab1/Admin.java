public class Admin {
    private String id;
    private String name;
    private String role;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver) {
    }

    public void manageRider(Rider rider) {
    }

    public void viewTripHistory(Trip trip) {
    }

    public void handleDispute(Trip trip) {
    }
}
