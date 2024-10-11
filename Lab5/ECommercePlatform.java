public class ECommercePlatform {
    public static void main(String[] args) {
        // Create some simple products
        SimpleProduct laptop = new SimpleProduct("Laptop", "High-performance laptop", 1200);
        SimpleProduct phone = new SimpleProduct("Phone", "Latest model smartphone", 800);

        // Create a normal bundle with no discount
        NormalBundle normalBundle = new NormalBundle("Electronics Bundle");
        normalBundle.addProduct(laptop);
        normalBundle.addProduct(phone);

        // Create a discounted bundle with a discount
        DiscountedBundle giftBundle = new DiscountedBundle("Holiday Gift Bundle", 100);
        giftBundle.addProduct(normalBundle); // Add the normal bundle
        giftBundle.addProduct(new SimpleProduct("Headphones", "Noise-cancelling headphones", 300));

        // Display all product details and calculate total price (only once)
        giftBundle.showDetails();
        System.out.println("Total Price: $" + giftBundle.getPrice());
    }
}