package Proxy.Clase;

public class RealImage implements Image{
    private String filename;

    public RealImage() {
    }

    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
