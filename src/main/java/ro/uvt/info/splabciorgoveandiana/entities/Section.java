package ro.uvt.info.splabciorgoveandiana.entities;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    String title;
    public List<Element> elementList= new ArrayList<>();
    public Section(String title){
        this.title = title;
    }

    public void print() {
        System.out.println("Section: " + title);
        for( Element e: elementList)
            e.print();
    }

    public void add(Element a) {
        elementList.add(a);
    }

    public Element get(int nr) {
        return null;
    }

    public void remove(Element a) {

    }

}
