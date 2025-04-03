package FlyweightPattern;
import java.util.*;
public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + color + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
            System.out.println("Creating new style: " + styles.get(key));
        }
        return styles.get(key);
    }

    public static int count() {
        return styles.size();
    }
}
