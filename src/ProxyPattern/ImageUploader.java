package ProxyPattern;

public class ImageUploader {
    private boolean isAuthenticated;

    public ImageUploader(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public void login() {
        isAuthenticated = true;
        System.out.println("User logged in.");
    }

    public void logout() {
        isAuthenticated = false;
        System.out.println("User logged out.");
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void uploadImage(String filename) {
        if (isAuthenticated) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access denied. Please log in to upload images.");
        }
    }
}
