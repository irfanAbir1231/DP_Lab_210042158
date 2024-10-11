class DiscountedBundle extends Bundle {
    private double discount;

    public DiscountedBundle(String name, double discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (ProductComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice - discount;
    }

    @Override
    public void showDetails() {
        System.out.println("Discounted Bundle: " + name + " (Discount: $" + discount + ")");
        super.showDetails();
    }
}