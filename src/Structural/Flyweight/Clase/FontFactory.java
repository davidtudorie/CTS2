package Structural.Flyweight.Clase;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    Map<String, Font> fonts = new HashMap<>();

    public Font getFont(String family, int size, String color){
        String key = family + "_" + String.valueOf(size) + "_" + color;
        if(!fonts.containsKey(key)){
            fonts.put(key, new Font(family, size, color));
        }
        return fonts.get(key);
    }
}
