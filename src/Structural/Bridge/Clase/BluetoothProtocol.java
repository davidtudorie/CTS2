package Structural.Bridge.Clase;

public class BluetoothProtocol implements Protocol{
    @Override
    public void send(String mesaj) {
        System.out.println("Trimitere bluetooth " + mesaj);
    }

    @Override
    public void connect() {
        System.out.println("Conectat prin bluetooth");
    }
}
