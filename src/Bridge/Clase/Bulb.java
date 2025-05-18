package Bridge.Clase;

public class Bulb extends Device{
    public Bulb(Protocol protocol) {
        super(protocol);
    }

    @Override
    public void turnOn() {
        System.out.print("Becul s a pornit");
        protocol.send("ON");
    }

    @Override
    public void turnOff() {
        System.out.print("Becul s a oprit ");
        protocol.send("OFF");
    }

    @Override
    public void testConnection() {
        super.testConnection();
    }

}
