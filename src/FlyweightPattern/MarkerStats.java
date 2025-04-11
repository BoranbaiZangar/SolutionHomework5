package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerStats {
    public static void printStyleUsage(MapCanvas canvas) {
        Map<MarkerStyle, Integer> usage = new HashMap<>();

        for (MapMarker marker : canvas.getMarkers()) {
            MarkerStyle style = marker.getStyle();
            usage.put(style, usage.getOrDefault(style, 0) + 1);
        }

        System.out.println("\nStyle usage statistics:");
        for (Map.Entry<MarkerStyle, Integer> entry : usage.entrySet()) {
            System.out.println(entry.getKey() + " used " + entry.getValue() + " times.");
        }
    }
}
