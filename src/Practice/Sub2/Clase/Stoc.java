package Practice.Sub2.Clase;

import java.util.HashMap;
import java.util.Map;

public class Stoc {
    static Map<IProdus, Integer> stoc = new HashMap<>();

   static int getStocProdus(Produs p){
        return stoc.getOrDefault(p, null);
    }

    public void addProdus(Produs p, int stoc){
        if(!Stoc.stoc.containsKey(p)){
            Stoc.stoc.put(p, stoc);
        }
        else{

            int cantitateNoua = Stoc.stoc.get(p) + stoc;
            Stoc.stoc.put(p, cantitateNoua);
        }
    }
}
