package OnlinePaymentGateway;

class PayPalPayment implements PaymentMethod {
    private String email;
    public PayPalPayment(String email) { this.email = email; }
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment $" + amount);
        return true;
    }
}