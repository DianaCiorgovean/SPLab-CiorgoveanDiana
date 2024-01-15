package ro.uvt.info.splabciorgoveandiana.LabVisitor;
import ro.uvt.info.splabciorgoveandiana.models.*;
import lombok.Getter;

@Getter
public class BookStatistics implements Visitor{
    private int nrImages;
    private int nrTables;
    private int nrParagraphs;

    @Override
    public void visitBook(Book book) {
        for (Element element :
                book.getElementList()) {
            element.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        for (Element element :
                section.getElementList()) {
            element.accept(this);
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        nrParagraphs++;
    }

    @Override
    public void visitImage(Image image) {
        nrImages++;
    }
    @Override
    public void visitTable(Table table) {
        nrTables++;
    }

    @Override
    public void visitElement(Element e) {

    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + nrImages);
        System.out.println("*** Number of tables: " + nrTables);
        System.out.println("*** Number of paragraphs: " + nrParagraphs);

    }
}