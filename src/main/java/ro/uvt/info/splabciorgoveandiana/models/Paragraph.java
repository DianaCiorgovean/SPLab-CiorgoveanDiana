package ro.uvt.info.splabciorgoveandiana.models;
import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitee;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitor;
import ro.uvt.info.splabciorgoveandiana.services.LeftAlignmentStrategy;
import ro.uvt.info.splabciorgoveandiana.services.AlignmentStrategy;

public class Paragraph extends Element implements Visitee {
    @Getter
    private final String text;
    @Setter
    private AlignmentStrategy alignStrategy;
    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if(alignStrategy != null)
            alignStrategy.render(this);
        else new LeftAlignmentStrategy().render(this);
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}