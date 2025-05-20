package Practice.Sub2.Clase;

public abstract class Magazin implements IComanda {
    @Override
    public double calculCost(Client client, double costLivrare) {
        double sumaCos = 0;
        for(Produs p : client.cosCumparaturi){
            sumaCos += p.pret;
        }
        return sumaCos + costLivrare;
    }
}
