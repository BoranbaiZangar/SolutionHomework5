package ProxyPattern;

public class ImageUploader {
    private boolean isAuthenticated;

    public ImageUploader(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public void uploadImage(String filename) {
        if (isAuthenticated) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access denied. Please log in to upload images.");
        }
    }
}