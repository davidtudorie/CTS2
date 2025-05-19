package Structural.Adapter.Clase;

public class ThirdPartyPaymentService{
    void pay(int centsAmount, String currencyCode){
        System.out.println("S a efectuat plata de " + centsAmount + ((currencyCode.equals("USD") || currencyCode.equals("EUR")) ? " centi" : " bani"));
    }
}
