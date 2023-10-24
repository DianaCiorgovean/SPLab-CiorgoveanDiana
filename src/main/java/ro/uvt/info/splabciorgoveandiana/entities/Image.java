package ro.uvt.info.splabciorgoveandiana.entities;

public class Image implements Element {
    public String imageName;
    public String ImageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }

    public void add(Element a) {

    }

    public Element get(int nr) {
        return null;
    }

    public void remove(Element a) {

    }
}
