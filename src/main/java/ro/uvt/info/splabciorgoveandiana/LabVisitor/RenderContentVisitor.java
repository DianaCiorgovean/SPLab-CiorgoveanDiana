package ro.uvt.info.splabciorgoveandiana.LabVisitor;

import ro.uvt.info.splabciorgoveandiana.models.*;

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

    @Override
    public void visitTable(Table table) {

    }

    @Override
    public void visitElement(Element e) {

    }

    private void renderBook(Book book) {
        System.out.println("Rendering Book: " + book.getTitle());
    }


}