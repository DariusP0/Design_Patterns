public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double getCost() {
        return super.getCost() + 1.0;
    }
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}