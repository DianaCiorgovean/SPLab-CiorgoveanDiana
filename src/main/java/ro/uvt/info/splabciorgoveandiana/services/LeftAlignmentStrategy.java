package ro.uvt.info.splabciorgoveandiana.services;

import ro.uvt.info.splabciorgoveandiana.models.Paragraph;

public class LeftAlignmentStrategy implements AlignmentStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: "  + paragraph.getText() + "#");
    }
}
