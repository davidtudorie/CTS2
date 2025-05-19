package Structural.Bridge.Program;

import Structural.Bridge.Clase.*;

public class Main {
    public static void main(String[] args) {
        Protocol wifi = new WIFIProtocol();
        Protocol bluetooth = new BluetoothProtocol();

        Device bulb = new Bulb(wifi);
        Device thermostat = new Thermostat(bluetooth);

        bulb.testConnection();
        bulb.turnOn();

        thermostat.testConnection();
        thermostat.turnOff();
    }
}
