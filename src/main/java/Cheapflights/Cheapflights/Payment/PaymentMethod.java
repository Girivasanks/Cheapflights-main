package Cheapflights.Cheapflights.Payment;

public interface PaymentMethod {
    double calculateTotalPriceWithFees(double subTotal);
    String getPaymentMethodName();
}
