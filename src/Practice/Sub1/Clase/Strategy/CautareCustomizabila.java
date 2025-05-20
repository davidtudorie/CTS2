package Practice.Sub1.Clase.Strategy;

import Practice.Sub1.Clase.Chain.BaseHandler;
import Practice.Sub1.Clase.Chain.CategorieHandler;
import Practice.Sub1.Clase.Chain.CuloareHandler;
import Practice.Sub1.Clase.Chain.PretHandler;
import Practice.Sub1.Clase.IClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CautareCustomizabila implements IClient {
    private static Map<String, BaseHandler> mapaFiltre;

    static{
        mapaFiltre = new HashMap<>();
        mapaFiltre.put("categorie", new CategorieHandler());
        mapaFiltre.put("pret", new PretHandler());
        mapaFiltre.put("culoare", new CuloareHandler());
    }
    @Override
    public TehnicaFiltrare alegeModFiltrare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul filtru:");
        String filtru1Key = sc.nextLine().toLowerCase();
        System.out.println("Introduceti al doilea filtru:");
        String filtru2Key = sc.nextLine().toLowerCase();
        System.out.println("Introduceti al treilea filtru:");
        String filtru3Key = sc.nextLine().toLowerCase();


        BaseHandler filtru1 = mapaFiltre.get(filtru1Key);
        BaseHandler filtru2 = mapaFiltre.get(filtru2Key);
        BaseHandler filtru3 = mapaFiltre.get(filtru3Key);

        return new TehnicaFiltrare(filtru1, filtru2, filtru3);
    }
}
