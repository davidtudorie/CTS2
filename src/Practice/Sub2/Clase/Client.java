package Practice.Sub2.Clase;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String username;
    List<Produs> cosCumparaturi = new ArrayList<>();

    public Client(String username, List<Produs> cosCumparaturi) {
        this.username = username;
        this.cosCumparaturi = cosCumparaturi;
    }

    @Override
    public String toString() {
        return "Client{" +
                "username='" + username + '\'' +
                ", cosCumparaturi=" + cosCumparaturi +
                '}';
    }
}
