package Bridge.Clase;

public abstract class Device {
    Protocol protocol;

    public Device(Protocol protocol) {
        this.protocol = protocol;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void testConnection(){
        protocol.connect();
    }
}
