package Practice.Sub2.Program;

import Practice.Sub2.Clase.*;
import Practice.Sub2.Clase.Produs;
import Practice.Sub2.Clase.Stoc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produs p1 = new Produs("nike", 300);
        Produs p2 = new Produs("adidas", 300);
        Produs p3 = new Produs("versace", 300);
        Produs p4 = new Produs("puma", 300);
        Produs p5 = new Produs("diesel", 300);
        List<Produs> cos = new ArrayList<>();
        cos.add(p1);
        cos.add(p2);
        cos.add(p3);
        cos.add(p4);
        cos.add(p5);

        PachetProduse pachet = new PachetProduse("Mystery box");
        PachetProduse pachet2 = new PachetProduse("Mystery box 2");
        PachetProduse pachet3 = new PachetProduse("Mystery box 3");
        PachetProduse pachet4 = new PachetProduse("Mystery box 4");
        pachet2.addProdus(pachet);
        pachet2.addProdus(p5);
        pachet3.addProdus(pachet2);
        pachet3.addProdus(p1);
        pachet3.addProdus(p2);
        pachet3.addProdus(p3);

        pachet.addProdus(p1);
        pachet.addProdus(p2);
        pachet.addProdus(p3);


//        Client c1 = new Client("Gigel", cos);
//        ComandaDecorator decorator = new ComandaDecorator();
//        System.out.println(decorator.calculCost(c1, 15));
//        System.out.println(decorator.calculCost(c1, 15));

        Stoc stoc = new Stoc();
        stoc.addProdus(p1, 30);
        stoc.addProdus(p1, 30);
        stoc.addProdus(p2, 50);
        stoc.addProdus(p3, 10);
        stoc.addProdus(p5, 30);
        stoc.addProdus(p1, 30);
        stoc.addProdus(p2, 50);
        stoc.addProdus(p3, 10);
        System.out.println(pachet.getCantitate());
        System.out.println(pachet.getPret());
        pachet3.print(" ");
    }
}
