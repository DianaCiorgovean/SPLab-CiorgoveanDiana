package ro.uvt.info.splabciorgoveandiana.entities;
import java.util.ArrayList;
import java.util.List;
public class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Subchapter Name: " + name);
    }
}
