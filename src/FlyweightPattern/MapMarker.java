package FlyweightPattern;

public class MapMarker {
    private double latitude;
    private double longitude;
    private MarkerStyle style;

    public MapMarker(double latitude, double longitude, MarkerStyle style) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.style = style;
    }

    public void display() {
        System.out.println("Marker at (" + latitude + ", " + longitude + ") with " + style);
    }
}