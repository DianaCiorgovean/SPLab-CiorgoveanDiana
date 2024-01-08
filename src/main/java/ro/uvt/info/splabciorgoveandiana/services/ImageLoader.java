package ro.uvt.info.splabciorgoveandiana.services;

import ro.uvt.info.splabciorgoveandiana.models.Picture;

public interface ImageLoader extends Picture {
    Picture load(String url);
}
