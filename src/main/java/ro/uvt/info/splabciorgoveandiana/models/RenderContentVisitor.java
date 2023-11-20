package ro.uvt.info.splabciorgoveandiana.models;

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