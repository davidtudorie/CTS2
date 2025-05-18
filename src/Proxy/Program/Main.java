package Proxy.Program;

import Proxy.Clase.Image;
import Proxy.Clase.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Imaginea nu este încărcată până la display()
        image1.display();  // Output: Loading photo1.jpg → Displaying photo1.jpg
        image1.display();  // Output: Displaying photo1.jpg (fără re-încărcare)

        image2.display();  // Output: Loading photo2.jpg → Displaying photo2.jpg
    }
}
