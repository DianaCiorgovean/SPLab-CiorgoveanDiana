package ro.uvt.info.splabciorgoveandiana.LabVisitor;

import ro.uvt.info.splabciorgoveandiana.models.Book;
import ro.uvt.info.splabciorgoveandiana.models.Image;
import ro.uvt.info.splabciorgoveandiana.models.Paragraph;
import ro.uvt.info.splabciorgoveandiana.models.Section;

public interface Visitor {
    void visitParagraph(Paragraph p);
    void visitBook(Book b);
    void visitSection(Section s);
    void visitImage( Image i);
};
