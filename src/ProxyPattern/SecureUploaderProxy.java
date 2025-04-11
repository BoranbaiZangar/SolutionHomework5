package ProxyPattern;

public class SecureUploaderProxy {
    private final ImageUploader uploader;

    public SecureUploaderProxy() {
        this.uploader = new ImageUploader(false);
    }

    public void login() {
        uploader.login();
    }

    public void logout() {
        uploader.logout();
    }

    public void uploadImage(String filename) {
        if (uploader.isAuthenticated()) {
            uploader.uploadImage(filename);
        } else {
            System.out.println("Upload blocked by proxy — user not authenticated.");
        }
    }
}
