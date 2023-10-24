package ro.uvt.info.splabciorgoveandiana.entities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Book extends Section{
    private String title;
    private TableOfContents tableOfContents;

    public List<Author> author = new ArrayList<Author>();


    public Book(String title)
    {
        super(title);
        this.title=title;
    }
    public void print(){
        System.out.println(title);
    for( Author a: author)
         a.print();
    for (Element e: elementList)
         e.print();
    }
    public void addAuthor(Author nume)
    {
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
}



