package Practice.Sub2.Clase;

import java.util.ArrayList;
import java.util.List;

public class ComandaDecorator extends Magazin{
    static List<Client> clienti = new ArrayList<>();
    @Override
    public double calculCost(Client client, double costLivrare) {
        if(clienti.contains(client))
            return super.calculCost(client, costLivrare);
        else{
            clienti.add(client);
            double totalSuma = super.calculCost(client, costLivrare);
            return totalSuma - (totalSuma*0.1);
        }
    }
}
