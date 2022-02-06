package command;

// comando que é para ser executado num determinado desenho (Paint)
// este comando adiciona (execute()) ou remove (unexecute()) uma imagem (Image)
public class ImageCommand implements DrawCommand {

    // desenho alvo (recetor)
    private Paint paint;
    // imagem a ser adicionada ou removida
    private Image image;

    public ImageCommand(Paint paint, Image image){
        this.paint = paint;
        this.image = image;
    }

    // adiciona a imagem ao desenho
    @Override
    public void execute() {
        paint.addImage(image);
    }

    // remove a imagem ao desenho
    @Override
    public void unexecute() {
        paint.removeImage(image);
    }
}
