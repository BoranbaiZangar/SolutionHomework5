package OnlinePaymentGateway;

public interface PaymentMethod {
    boolean processPayment(double amount);
}