import java.util.ArrayList;
import java.util.List;

public class Box implements OrderComponent {
    private List<OrderComponent> components = new ArrayList<>();
    private String name;

    public Box(String name) {
        this.name = name;
    }

    public void addComponent(OrderComponent component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (OrderComponent component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return name;
    }
}