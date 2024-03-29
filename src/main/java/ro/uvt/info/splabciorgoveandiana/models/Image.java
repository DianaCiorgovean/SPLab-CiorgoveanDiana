package ro.uvt.info.splabciorgoveandiana.models;

import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitee;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.Visitor;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture, Visitee {
    private String url;
    private String imageContent;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public Image(Image other){
        this.url = other.url;
    }
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override
    public Element clone() {
        return new Image(this);
    }

    @Override
    public void add(Element a) {

    }
    @Override
    public Element get(int nr) {
        return null;
    }
    @Override
    public void remove(Element a) {
    }
    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public BufferedImage getImage() {
        return null;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
