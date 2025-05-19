package Structural.Adapter.Clase;

public class PaymentAdapter implements PaymentProcessor{
    ThirdPartyPaymentService tpps = new ThirdPartyPaymentService();

    public PaymentAdapter(ThirdPartyPaymentService tpps) {
        this.tpps = tpps;
    }

    @Override
    public void processPayment(double amount, String currency) {
        int centsAmount = (int)(amount * 100);
        String code;
        if(currency == "euro")
            code="EUR";
        else if (currency == "dollars") {
            code="USD";
        } else if (currency == "lei") {
            code="RON";
        } else throw new IllegalArgumentException("Nu exista currency-ul introdus in baza de date!");

        tpps.pay(centsAmount, code);
    }
}
