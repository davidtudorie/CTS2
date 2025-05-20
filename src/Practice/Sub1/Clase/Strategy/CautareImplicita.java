package Practice.Sub1.Clase.Strategy;

import Practice.Sub1.Clase.Chain.CategorieHandler;
import Practice.Sub1.Clase.Chain.CuloareHandler;
import Practice.Sub1.Clase.Chain.PretHandler;
import Practice.Sub1.Clase.IClient;

public class CautareImplicita implements IClient {
    @Override
    public TehnicaFiltrare alegeModFiltrare() {
        CategorieHandler ch = new CategorieHandler();

        PretHandler ph = new PretHandler();

        CuloareHandler colorh = new CuloareHandler();

        return new TehnicaFiltrare(ch, ph, colorh);
    }
}
