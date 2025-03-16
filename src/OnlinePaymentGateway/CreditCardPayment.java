package OnlinePaymentGateway;

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    public CreditCardPayment(String cardNumber) { this.cardNumber = cardNumber; }
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment $" + amount);
        return true;
    }
}