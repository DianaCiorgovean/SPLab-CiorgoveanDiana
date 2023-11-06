package ro.uvt.info.splabciorgoveandiana.entities;

import java.awt.*;

public class ImageProxy extends Element  implements Picture{
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
    public void print() {

    }

    @Override
    public Element clone() {
        return null;
    }
}