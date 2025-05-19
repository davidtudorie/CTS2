package Behavioral.Strategy.Clase;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("S-a efectuat de " + amount + " cu PAYPAL");
    }
}
