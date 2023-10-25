public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Cost: $" + espresso.getCost() + ", Description: " + espresso.getDescription());

        Coffee sugarEspresso = new SugarDecorator(espresso);
        System.out.println("Cost: $" + sugarEspresso.getCost() + ", Description: " + sugarEspresso.getDescription());

        Coffee milkSugarEspresso = new MilkDecorator(sugarEspresso);
        System.out.println("Cost: $" + milkSugarEspresso.getCost() + ", Description: " + milkSugarEspresso.getDescription());
    }
}
