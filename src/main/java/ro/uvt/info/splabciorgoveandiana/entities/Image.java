package ro.uvt.info.splabciorgoveandiana.entities;

class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }
}
