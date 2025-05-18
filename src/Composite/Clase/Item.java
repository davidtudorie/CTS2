package Composite.Clase;

public class Item implements FileSystemItem {
    String name;
    double size;

    public Item(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name);
    }

    @Override
    public double getSize() {
        return size;
    }
}
