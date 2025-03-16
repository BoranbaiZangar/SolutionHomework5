package CoffeeShopSimulator;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if(type.equalsIgnoreCase("espresso")) return new Espresso();
        if(type.equalsIgnoreCase("cappuccino")) return new Cappuccino();
        if(type.equalsIgnoreCase("latte")) return new Latte();
        throw new IllegalArgumentException("Unknown coffee type");
    }
}