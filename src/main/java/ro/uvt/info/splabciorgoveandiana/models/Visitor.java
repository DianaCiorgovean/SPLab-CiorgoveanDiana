package ro.uvt.info.splabciorgoveandiana.models;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitBook(Book b);
    void visitSection(Section s);
    void visitImage( Image i);
};
