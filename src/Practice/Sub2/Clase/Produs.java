package Practice.Sub2.Clase;

public class Produs implements IProdus {
    String denumire;
    double pret;

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public double getCantitate() {
        return Stoc.getStocProdus(this);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + denumire + " (" + Stoc.getStocProdus(this) +")");
    }
}
