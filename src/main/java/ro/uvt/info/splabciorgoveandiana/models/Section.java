package ro.uvt.info.splabciorgoveandiana.models;

import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitee;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element implements Visitee {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }


}
