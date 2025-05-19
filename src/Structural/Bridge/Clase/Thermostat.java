package Structural.Bridge.Clase;

public class Thermostat extends Device{
    public Thermostat(Protocol protocol) {
        super(protocol);
    }

    @Override
    public void testConnection() {
        super.testConnection();
    }

    @Override
    public void turnOff() {
        System.out.print("Termostatul s a oprit");
        protocol.send("OFF");
    }

    @Override
    public void turnOn() {
        System.out.print("Termostatul s a pornit ");
        protocol.send("ON");
    }
}
