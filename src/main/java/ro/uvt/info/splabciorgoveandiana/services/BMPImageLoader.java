package ro.uvt.info.splabciorgoveandiana.services;
import ro.uvt.info.splabciorgoveandiana.models.Picture;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class BMPImageLoader implements ImageLoader {
    @Override
    public Picture load(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            return new Picture() {
                @Override
                public String getUrl() {
                    return null;
                }

                @Override
                public BufferedImage getImage() {
                    return null;
                }
            };
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public BufferedImage getImage() {
        return null;
    }
}
