package Practice.Sub1.Clase.Chain;

import Practice.Sub1.Clase.ICautare;

import java.util.List;

public abstract class BaseHandler implements ICautare {
    ICautare nextHandler;

    @Override
    public abstract List<Produs> filtreaza(List<Produs> produse);

    @Override
    public void setNextHandler(ICautare handler) {
        this.nextHandler = handler;
    }
}
