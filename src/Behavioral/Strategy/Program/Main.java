package Behavioral.Strategy.Program;

import Behavioral.Strategy.Clase.*;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentOption(new CardPayment());
        processor.processPayment(100); // Plătit cu cardul

        processor.setPaymentOption(new PayPalPayment());
        processor.processPayment(100); // Plătit cu PayPal
    }
}
