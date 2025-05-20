package Practice.Sub1.Clase.Chain;

import java.util.ArrayList;
import java.util.List;

public class PretHandler extends BaseHandler{

    @Override
    public List<Produs> filtreaza(List<Produs> produse) {
        List<Produs> produseFiltrate = new ArrayList<>();
        for(Produs p : produse){
            if(p.pret > 500 && p.pret < 1000){
                produseFiltrate.add(p);
            }
        }
        if(nextHandler != null){
            return nextHandler.filtreaza(produseFiltrate);
        } else
            return produseFiltrate;
    }

}
