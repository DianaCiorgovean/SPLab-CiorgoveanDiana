package ro.uvt.info.splabciorgoveandiana.models;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " +  "#" + paragraph.getText() + "#");
    }
}
