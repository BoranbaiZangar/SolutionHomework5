package ProxyPattern;

public class ProxyImage implements Image {
    private String filename;
    private HighResolutionImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        System.out.println("Showing thumbnail preview of " + filename);
    }

    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResolutionImage(filename);
        }
        realImage.displayFullImage();
    }
}
