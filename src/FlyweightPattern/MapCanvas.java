package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class MapCanvas {
    private final List<MapMarker> markers = new ArrayList<>();

    public void addMarker(MapMarker marker) {
        markers.add(marker);
    }

    public void render() {
        System.out.println("\nRendering map:");
        for (MapMarker marker : markers) {
            marker.display();
        }
    }

    public List<MapMarker> getMarkers() {
        return markers;
    }
}
