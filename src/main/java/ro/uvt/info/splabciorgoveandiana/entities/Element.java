package ro.uvt.info.splabciorgoveandiana.entities;

public interface Element {
    public void print();
    void add(Element a);
    Element get(int nr);
    void remove(Element a);
}
