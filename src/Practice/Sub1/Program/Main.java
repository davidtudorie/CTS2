package Practice.Sub1.Program;

import Practice.Sub1.Clase.Chain.Categorie;
import Practice.Sub1.Clase.Chain.Produs;
import Practice.Sub1.Clase.Strategy.CautareCustomizabila;
import Practice.Sub1.Clase.Strategy.CautareImplicita;
import Practice.Sub1.Clase.Strategy.TehnicaFiltrare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produs p1 = new Produs("nike", Categorie.SPORT, 450, "alb");
        Produs p2 = new Produs("nike", Categorie.ELEGANTI, 450, "alb");
        Produs p3 = new Produs("nike", Categorie.SPORT, 890, "alb");
        Produs p4 = new Produs("nike", Categorie.GHETE, 450, "alb");
        Produs p5 = new Produs("nike", Categorie.SPORT, 200, "alb");
        Produs p6 = new Produs("nike", Categorie.ELEGANTI, 450, "alb");
        Produs p7 = new Produs("nike", Categorie.SPORT, 600, "negru");

        List<Produs> produse = new ArrayList<>();
        produse.add(p1);
        produse.add(p2);
        produse.add(p3);
        produse.add(p4);
        produse.add(p5);
        produse.add(p6);
        produse.add(p7);

//        CategorieHandler categorieHandler= new CategorieHandler();
//        PretHandler pretHandler = new PretHandler();
//
//        categorieHandler.setCategorieDorita(Categorie.SPORT);
//        categorieHandler.setNextHandler(pretHandler);
//
//        pretHandler.setIntervalPret(250, 700);
//
//        System.out.println(categorieHandler.filtreaza(produse));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti tipul de client: 1 - Implicit, 2 - Personalizat");
        int optiune = scanner.nextInt();
        scanner.nextLine(); // consumă newline
        TehnicaFiltrare client;
        if (optiune == 1) {
            client = new CautareImplicita().alegeModFiltrare();
        } else {
            client = new CautareCustomizabila().alegeModFiltrare();
        }

        System.out.println(client.getHandler1().filtreaza(produse));
    }
}
