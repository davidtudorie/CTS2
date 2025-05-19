package Structural.Flyweight.Clase;

public class Font {
    //flyweight class
    public String family;
    public int size;
    public String color;

    protected Font(String family, int size, String color) {
        this.family = family;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" + family + ", " + size + ", " + color + "]";
    }
}
