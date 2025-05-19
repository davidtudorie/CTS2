package Structural.Flyweight.Program;

import Structural.Flyweight.Clase.Character;
import Structural.Flyweight.Clase.FontFactory;

public class Main {
    public static void main(String[] args) {
        FontFactory factory = new FontFactory();

        Character c1 = new Character('A', factory.getFont("Arial", 12, "Black"));
        Character c2 = new Character('B', factory.getFont("Arial", 12, "Black")); // Același font ca c1
        Character c3 = new Character('C', factory.getFont("Times New Roman", 14, "Red"));

        c1.print();
        c2.print();
        c3.print();
    }
}
