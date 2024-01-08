package ro.uvt.info.splabciorgoveandiana.models;
import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitee;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Book extends Section implements Visitee {

    private String title;
    int Id;
    private TableOfContents tableOfContents;

    public List<Author> author = new ArrayList<>();


    public Book(String title,int Id) {
        super(title);
        this.title = title;
        this.Id = Id;
    }

    public void print() {
        System.out.println(title);
        for (Author a : author)
            a.print();
        for (Element e : elementList)
            e.print();
    }

    public void addAuthor(Author nume) {
        author.add(nume);
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", tableOfContents=" + tableOfContents +
                '}';
    }

    public void addContent(Element a) {
        elementList.add(a);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

}


