package ro.uvt.info.splabciorgoveandiana.entities;

public class Paragraph extends Element {
    String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
    @Override
    public Element clone() {
        return null;
    }
    @Override
    public void add(Element a) {
    }
    @Override
    public Element get(int nr) {
        return null;
    }
    @Override
    public void remove(Element a) {
    }
}