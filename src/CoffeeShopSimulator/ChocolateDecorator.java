package CoffeeShopSimulator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.7; }
    public String getDescription() { return coffee.getDescription() + ", Chocolate"; }
}
