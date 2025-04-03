package FlyweightPattern;
import java.util.*;
public final class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();
    private static int styleRequests = 0;

    private MarkerStyleFactory() {}

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        styleRequests++;
        String key = String.join("|", icon, color, labelStyle);
        return styles.computeIfAbsent(key, k -> {
            MarkerStyle style = new MarkerStyle(icon, color, labelStyle);
            System.out.println("Creating new style: " + style);
            return style;
        });
    }

    public static int countUniqueStyles() {
        return styles.size();
    }

    public static int countTotalRequests() {
        return styleRequests;
    }
}