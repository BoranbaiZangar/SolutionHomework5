import ProxyPattern.*;
import FlyweightPattern.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-- Proxy Pattern Demo --");

        Image image1 = new ProxyImage("house1.jpg");
        Image image2 = new ProxyImage("house2.jpg");

        image1.display();
        image1.displayFullImage();

        image2.display();
        image2.displayFullImage();

        ImageUploader uploader = new ImageUploader(false);
        uploader.uploadImage("new_house.jpg");

        uploader = new ImageUploader(true);
        uploader.uploadImage("villa.jpg");

        System.out.println("\n-- Flyweight Pattern Demo --");

        List<MapMarker> markers = new ArrayList<>(1500);

        for (int i = 0; i < 1000; i++) {
            MarkerStyle style = MarkerStyleFactory.getStyle("restaurant", "red", "bold");
            markers.add(new MapMarker(i, i, style));
        }

        for (int i = 0; i < 500; i++) {
            MarkerStyle style = MarkerStyleFactory.getStyle("hospital", "blue", "italic");
            markers.add(new MapMarker(i, -i, style));
        }

        System.out.printf("Total markers created: %d%n", markers.size());
        System.out.printf("Unique styles created: %d%n", MarkerStyleFactory.countUniqueStyles());
        System.out.printf("Total style requests (includes duplicates): %d%n", MarkerStyleFactory.countTotalRequests());
    }
}