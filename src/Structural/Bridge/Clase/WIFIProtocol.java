package Structural.Bridge.Clase;

public class WIFIProtocol implements Protocol{
    @Override
    public void connect() {
        System.out.println("Conectat prin wifi");
    }

    @Override
    public void send(String mesaj) {
        System.out.println(" Transmitere WIFI " + mesaj);
    }
}
