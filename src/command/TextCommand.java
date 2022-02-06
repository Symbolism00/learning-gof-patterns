package command;

// comando que é para ser executado num determinado desenho (Paint)
// este comando adiciona (execute()) ou remove (unexecute()) um texto (Text)
public class TextCommand implements DrawCommand {

    // desenho alvo (recetor)
    private Paint paint;
    // texto a ser adicionada ou removida
    private Text text;

    public TextCommand(Paint paint, Text text){
        this.paint = paint;
        this.text = text;
    }

    // adiciona o texto ao desenho
    @Override
    public void execute() {
        paint.addText(text);
    }

    // remove o texto ao desenho
    @Override
    public void unexecute() {
        paint.removeText(text);
    }
}
