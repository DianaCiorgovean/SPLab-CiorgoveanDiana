package ro.uvt.info.splabciorgoveandiana.models;

class Table extends Element {
    String title;

    public Table() {
        this.title = title;
    }

    public void print() {
        System.out.println("Table: " + title);
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