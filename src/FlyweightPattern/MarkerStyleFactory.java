package FlyweightPattern;

import java.util.*;

public final class MarkerStyleFactory {
    private static final Map<MarkerStyle, MarkerStyle> styles = new HashMap<>();
    private static int styleRequests = 0;

    private MarkerStyleFactory() {}

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        styleRequests++;
        MarkerStyle key = new MarkerStyle(icon, color, labelStyle);
        return styles.computeIfAbsent(key, k -> {
            System.out.println("Creating new style: " + k);
            return k;
        });
    }

    public static int countUniqueStyles() {
        return styles.size();
    }

    public static int countTotalRequests() {
        return styleRequests;
    }

    public static void clearCache() {
        styles.clear();
        styleRequests = 0;
    }

    public static Collection<MarkerStyle> getAllStyles() {
        return Collections.unmodifiableCollection(styles.values());
    }
}
