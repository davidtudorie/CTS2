package Adapter.Program;

import Adapter.Clase.PaymentAdapter;
import Adapter.Clase.PaymentProcessor;
import Adapter.Clase.ThirdPartyPaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter(new ThirdPartyPaymentService());
        processor.processPayment(50.75, "lei"); // Convertit în 5075 cenți + cod "EUR"
    }
}
