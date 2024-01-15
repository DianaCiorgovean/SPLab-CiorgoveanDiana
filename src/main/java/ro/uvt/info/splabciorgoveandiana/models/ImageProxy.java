package ro.uvt.info.splabciorgoveandiana.models;

import java.awt.image.BufferedImage;

public class ImageProxy extends Element implements Picture {
    private Image realImage;
    private String url;
    public ImageProxy(String url){
        this.url = url;
    }

    public Image LoadImage(){
        if(realImage == null)
            realImage = new Image(url);
        return realImage;
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
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public Element clone() {
        return null;
    }
}