package ProxyPattern;

public class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading full-resolution image: " + filename);
    }

    public void display() {
        System.out.println("Displaying thumbnail of " + filename);
    }

    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}