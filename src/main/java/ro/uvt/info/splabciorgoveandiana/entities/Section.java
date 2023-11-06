package ro.uvt.info.splabciorgoveandiana.entities;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
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

    @Override
    public Element clone() {
        return null;
    }

    @Override
    public void add(Element a) {
        elementList.add(a);
    }
    @Override
    public Element get(int nr) {
        return null;
    }
    @Override
    public void remove(Element a) {
    }

}
