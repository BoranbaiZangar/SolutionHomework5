package ProxyPattern;

public class HighResolutionImage implements Image {
    private final String filename;
    private boolean loaded = false;

    public HighResolutionImage(String filename) {
        this.filename = filename;
    }

    private void loadFromDisk() {
        System.out.println("Loading full-resolution image from disk: " + filename);
        loaded = true;
    }

    @Override
    public void display() {
        System.out.println("Displaying thumbnail of " + filename);
    }

    @Override
    public void displayFullImage() {
        if (!loaded) {
            loadFromDisk();
        }
        System.out.println("Displaying full-resolution image: " + filename);
    }

    @Override
    public String getFileName() {
        return filename;
    }
}
