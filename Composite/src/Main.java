
public class Main {
    public static void main(String[] args) {
        // Create individual products
        OrderComponent product1 = new Product("Widget A", 10.0);
        OrderComponent product2 = new Product("Widget B", 15.0);
        OrderComponent product3 = new Product("Widget C", 20.0);

        // Create boxes
        OrderComponent box1 = new Box("Box 1");
        OrderComponent box2 = new Box("Box 2");

        // Add products to boxes
        ((Box) box1).addComponent(product1);
        ((Box) box1).addComponent(product2);

        ((Box) box2).addComponent(product3);

        // Create a larger box containing the two smaller boxes
        OrderComponent order = new Box("Order");
        ((Box) order).addComponent(box1);
        ((Box) order).addComponent(box2);

        // Calculate the total price of the order
        double totalPrice = order.getPrice();
        System.out.println("Total Price of the Order: $" + totalPrice);
    }
}
