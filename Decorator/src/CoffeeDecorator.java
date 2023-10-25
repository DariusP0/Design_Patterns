abstract class CoffeeDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
