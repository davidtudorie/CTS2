package Practice.Sub1.Clase.Chain;

public class Produs {

    String denumire;
    Categorie categorie;
    double pret;
    String culoare;

    public Produs(String denumire, Categorie categorie, double pret, String culoare) {
        this.denumire = denumire;
        this.categorie = categorie;
        this.pret = pret;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", categorie=" + categorie +
                ", pret=" + pret +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
