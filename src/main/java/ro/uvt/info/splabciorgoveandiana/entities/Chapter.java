package ro.uvt.info.splabciorgoveandiana.entities;
import java.util.ArrayList;
import java.util.List;
public class Chapter {
    private String name;
    private List<SubChapter> subchapters;

    public Chapter(String name) {
        this.name = name;
        this.subchapters = new ArrayList<>();
    }

    public void addSubchapter(SubChapter subchapter) {
        subchapters.add(subchapter);
   }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subchapter : subchapters) {
            subchapter.print();
        }
    }
}
