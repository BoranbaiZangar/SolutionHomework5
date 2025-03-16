package OnlinePaymentGateway;

class CryptoPayment implements PaymentMethod {
    private String wallet;
    public CryptoPayment(String wallet) { this.wallet = wallet; }
    public boolean processPayment(double amount) {
        System.out.println("Processing crypto payment $" + amount);
        return true;
    }
}