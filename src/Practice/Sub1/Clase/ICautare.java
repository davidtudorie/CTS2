package Practice.Sub1.Clase;

import Practice.Sub1.Clase.Chain.Produs;

import java.util.List;

public interface ICautare {
    List<Produs> filtreaza(List<Produs> produse);
    void setNextHandler(ICautare handler);
}
