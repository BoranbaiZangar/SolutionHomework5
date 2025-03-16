package OnlinePaymentGateway;

public class PaymentFactory {
    public PaymentMethod createPayment(String type, String credential) {
        switch(type.toLowerCase()) {
            case "credit": return new CreditCardPayment(credential);
            case "paypal": return new PayPalPayment(credential);
            case "crypto": return new CryptoPayment(credential);
            default: throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
