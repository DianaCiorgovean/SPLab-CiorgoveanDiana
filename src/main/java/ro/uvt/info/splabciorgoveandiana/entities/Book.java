package ro.uvt.info.splabciorgoveandiana.entities;
import java.util.ArrayList;
import java.util.List;
public class Book {
    private String title;
    private TableOfContents tableOfContents;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.tableOfContents = new TableOfContents();
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

        public void print() {
            System.out.println("Book Title: " + title);
            tableOfContents.print();

            for (Chapter chapter : chapters) {
                chapter.print();
            }
        }
    }




