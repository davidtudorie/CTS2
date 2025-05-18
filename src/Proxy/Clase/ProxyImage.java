package Proxy.Clase;

import java.util.ArrayList;
import java.util.List;

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
