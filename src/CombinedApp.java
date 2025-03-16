import CoffeeShopSimulator.ChocolateDecorator;
import CoffeeShopSimulator.Coffee;
import CoffeeShopSimulator.CoffeeFactory;
import CoffeeShopSimulator.MilkDecorator;
import OnlinePaymentGateway.PaymentFactory;
import OnlinePaymentGateway.PaymentMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinedApp {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> paymentHistory = new ArrayList<>();

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n1. Order Coffee");
            System.out.println("2.Show Paymant History");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            if(choice.equals("3")) break;
            if(choice.equals("2")) showHistory();
            if(choice.equals("1")) orderCoffee();
        }
    }

    private static void orderCoffee() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        System.out.print("Choose coffee (Espresso/Cappuccino/Latte): \n");
        Coffee coffee = coffeeFactory.createCoffee(scanner.nextLine());

        while(true) {
            System.out.print("Add topping Milk/Chocolate/Done: \n  ");
            String topping = scanner.nextLine();
            if(topping.equalsIgnoreCase("done")) break;

            if(topping.equalsIgnoreCase("milk")) coffee = new MilkDecorator(coffee);
            else if(topping.equalsIgnoreCase("chocolate")) coffee = new ChocolateDecorator(coffee);
        }

        System.out.println("\nYour order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());

        processPayment(coffee.getCost());
    }

    private static void processPayment(double amount) {
        PaymentFactory paymentFactory = new PaymentFactory();

        System.out.println("Payment Methods:\n");
        System.out.println("1.Credit Card");
        System.out.println("2.PayPal");
        System.out.println("3.Crypto");
        System.out.print("Choose payment method: ");

        String method = scanner.nextLine();
        String type = "";
        String credential = "";

        switch(method) {
            case "1":
                type = "credit";
                System.out.print("Enter card number: ");
                credential = scanner.nextLine();
                break;
            case "2":
                type = "paypal";
                System.out.print("Enter email: ");
                credential = scanner.nextLine();
                break;
            case "3":
                type = "crypto";
                System.out.print("Enter wallet address: ");
                credential = scanner.nextLine();
                break;
            default:
                System.out.println("Invalid payment method!");
                return;
        }

        PaymentMethod payment = paymentFactory.createPayment(type, credential);
        boolean success = payment.processPayment(amount);





        String status;
        if (success) {
            status = "Success";
        } else {
            status = "Failed";
        }
        String entry = type.toUpperCase() + " - $" + String.format("%.2f", amount) + " - " + status;
        paymentHistory.add(entry);


        System.out.println("\n Payment " + status + "!");
    }
    private static void showHistory() {
        System.out.println("\n Payment History:");
        if(paymentHistory.isEmpty()) System.out.println("No payments yet");
        else paymentHistory.forEach(System.out::println);
    }
}