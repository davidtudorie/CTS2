package Practice.Sub2.Clase;

import java.util.ArrayList;
import java.util.List;

public class PachetProduse implements IProdus{
    String denumire;
    List<IProdus> produse = new ArrayList<>();

    public PachetProduse(String denumire) {
        this.denumire = denumire;
    }

    public void addProdus(IProdus produs){
        if(!this.produse.contains(produs)){
            produse.add(produs);
        }
    }
    @Override
    public double getPret() {
        double pretTotal = 0;
        for(IProdus p : produse){
            pretTotal += p.getPret();
        }
        return pretTotal;
    }

    @Override
    public double getCantitate() {
        double cantitateToala = 0;
        for(IProdus p : produse){
            cantitateToala += Stoc.getStocProdus((Produs) p);
        }
        return cantitateToala;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + denumire);
            for(IProdus p : produse){
                p.print(indent + indent);
            }
    }
}
