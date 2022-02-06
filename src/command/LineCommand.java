package command;

// comando que é para ser executado num determinado desenho (Paint)
// este comando adiciona (execute()) ou remove (unexecute()) uma linha (Line)
public class LineCommand implements DrawCommand {

    // desenho alvo (recetor)
    private Paint paint;
    // linha a ser adicionada ou removida
    private Line line;

    public LineCommand(Paint paint, Line line){
        this.paint = paint;
        this.line = line;
    }

    // adiciona a linha ao desenho
    @Override
    public void execute() {
        paint.addLine(line);
    }

    // remove a linha ao desenho
    @Override
    public void unexecute() {
        paint.removeLine(line);
    }
}
