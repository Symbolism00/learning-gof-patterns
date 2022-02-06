package command;

import java.util.ArrayList;
import java.util.List;

// recetor em que os comandos vão ser executados
public class Paint {

    // podem ser desenhados textos
    private List<Text> texts;
    // podem ser desenhadas imagens
    private List<Image> images;
    // podem ser desenhadas linhas
    private List<Line> lines;

    public Paint(){
        this.texts = new ArrayList<>();
        this.images = new ArrayList<>();
        this.lines = new ArrayList<>();
    }

    // adiciona um texto ao desenho
    public void addText(Text newText){
        texts.add(newText);
    }

    // adiciona uma imagem ao desenho
    public void addImage(Image newImage){
        images.add(newImage);
    }

    // adiciona uma linha ao desenho
    public void addLine(Line newLine){
        lines.add(newLine);
    }

    // remove um texto ao desenho
    public void removeText(Text text){
        texts.remove(text);
    }

    // remove uma imagem ao desenho
    public void removeImage(Image image){
        images.remove(image);
    }

    // remove uma linha ao desenho
    public void removeLine(Line line){
        lines.remove(line);
    }

    // mostra o que está atualmente desenhado
    public String showPainting(){
        StringBuilder sb = new StringBuilder("Texts:\n");
        texts.forEach(t -> sb.append("-> ").append(t).append(";\n"));
        sb.append("Images:\n");
        images.forEach(i -> sb.append("-> ").append(i).append(";\n"));
        sb.append("Lines:\n");
        lines.forEach(l -> sb.append("-> ").append(l).append(";\n"));
        return sb.toString();
    }
}
