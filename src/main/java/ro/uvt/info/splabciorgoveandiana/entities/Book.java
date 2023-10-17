package ro.uvt.info.splabciorgoveandiana.entities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Book {
    private String title;
    private TableOfContents tableOfContents;
    public List<Chapter> chapter= new ArrayList<Chapter>();
    public List<Author> author = new ArrayList<Author>();

    public Book(List<Author> author) {
        this.author = author;
    }
    public Book(String title)
    {
        this.title=title;
    }
    public void print(){System.out.println(title);}
    public void addAuthor(Author nume)
    {
        author.add(nume);
    }
    public int createChapter(String nume)
    { Chapter a = new Chapter();
        a.name=nume;
        chapter.add(a);
        return chapter.indexOf(a);
    }
    public Chapter getChapter(int nr)
    {
        return chapter.get(nr);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", chapter=" + chapter +
                ", author=" + author +
                ", tableOfContents=" + tableOfContents +
                '}';
    }

}



