package ro.uvt.info.splabciorgoveandiana.models;
import lombok.Getter;
import lombok.Setter;
public class Paragraph extends Element {
    @Getter
    private final String text;
    @Setter
    private AlignStrategy alignStrategy;
    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if(alignStrategy != null)
            alignStrategy.render(this);
        else new AlignLeft().render(this);
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