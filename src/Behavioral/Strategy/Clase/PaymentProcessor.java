package Behavioral.Strategy.Clase;

public class PaymentProcessor {
    private PaymentStrategy paymentOption;

    public void setPaymentOption(PaymentStrategy paymentOption) {
        this.paymentOption = paymentOption;
    }

    public void processPayment(double amount){
        paymentOption.pay(amount);
    }
}
