package ro.uvt.info.splabciorgoveandiana.LabVisitor;

import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitor;
import ro.uvt.info.splabciorgoveandiana.models.Book;
import ro.uvt.info.splabciorgoveandiana.models.Image;
import ro.uvt.info.splabciorgoveandiana.models.Paragraph;
import ro.uvt.info.splabciorgoveandiana.models.Section;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitParagraph(Paragraph p) {
    }

    @Override
    public void visitBook(Book b) {
        renderBook(b);
    }
    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitImage(Image i) {

    }

    private void renderBook(Book book) {
        System.out.println("Rendering Book: " + book.getTitle());
    }


}