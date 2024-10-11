import java.util.ArrayList;
import java.util.List;

abstract class Bundle implements ProductComponent {
    protected String name;
    protected List<ProductComponent> items = new ArrayList<>();

    public Bundle(String name) {
        this.name = name;
    }

    abstract void addProducts();


    @Override
    public void showDetails() {
        System.out.println("Bundle: " + name);
        for (ProductComponent item : items) {
            item.showDetails();
        }
    }
    public double getPrice(){
        return 0.0;
}

}