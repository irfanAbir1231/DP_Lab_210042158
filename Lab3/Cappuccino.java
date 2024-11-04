public class Cappuccino extends Beverage{
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 3.50;  // Base cost of Cappuccino
    }
}
