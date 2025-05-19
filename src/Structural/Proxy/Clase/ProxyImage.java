package Structural.Proxy.Clase;

public class ProxyImage implements Image {
    private String filename;
    private RealImage imagine;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(this.imagine == null){
            this.imagine = new RealImage(this.filename);
        }
        this.imagine.display();


    }
}
