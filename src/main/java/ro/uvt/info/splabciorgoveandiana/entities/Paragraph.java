package ro.uvt.info.splabciorgoveandiana.entities;

public class Paragraph implements Element {
    String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    public void add(Element a) {

    }

    public Element get(int nr) {
        return null;
    }

    public void remove(Element a) {

    }
}