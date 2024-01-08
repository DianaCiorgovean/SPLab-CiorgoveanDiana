package ro.uvt.info.splabciorgoveandiana.services;

import ro.uvt.info.splabciorgoveandiana.models.Picture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader implements ImageLoader {
    @Override
    public Picture load(String url) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(url));

            return new Picture() {
                @Override
                public String getUrl() {
                    return url;
                }

                @Override
                public BufferedImage getImage() {
                    return bufferedImage;
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