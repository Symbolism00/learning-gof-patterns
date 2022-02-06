package command;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // assume-se que se quer criar um desenho que contém uma imagem de um cão
        // uma linha reta e um texto aleatório. O padrão Command permite de forma
        // dinâmica criar diferentes comandos para o mesmo desenho sem que a
        // adição de novos comandos interfiram com os comandos previamente criados
        // Por norma, este padrão indica que todos os comandos devem conter uma
        // operação de execute() ou do() e outra de unexecute() ou undo()
        // Assim, para cada tipo de comando, existirão:
        // Comando de linha: que permite adicionar e remover uma linha ao desenho
        // Comando de Texto: que permite adicionar e remover um texto ao desenho
        // Comando de Imagem: que permite adicionar e remover uma imagem ao desenho
        // No exemplo seguinte os comandos de adição e remoção são muito simples,
        // porém a implementação de cada um pode variar de comando para comando
        // Sempre que se quer executar um comando, é necessário criar um e
        // pedir para que CommandInvoker execute o mesmo, esta classe não tem
        // qualquer conhecimento sobre que objeto é que irá executar o comando
        // apenas sabe que tem que executar um comando, por exemplo desenhar uma linha,
        // desenhar uma imagem, ou desenhar um texto.
        // O facto do invocador de comandos não ter conhecimento sobre o objeto alvo,
        // permite que diferente comandos com diferentes alvos ou implementações
        // sejam executados para o mesmo invocador.
        // -> Diferentes invocadores: Por exemplo o invocador A poderia no futuro em vez de
        //                            executar comandos para um Paint, poderia executar para um Diagram.
        // -> Diferentes implementações: Por exemplo o invocador A com o comando A que executava
        //                               os passos 1 -> 2 -> 3, no futuro podia ter este comando alterado
        //                               para o comando B que executava os passos 4 -> 2 -> 5 -> 1
        // Este padrão também permite criar diferentes combinações de comandos para diferentes
        // invocadores, por exemplo o CommandInvokerSimplePaint que só consegue desenhar
        // texto e linhas e o CommandInvokerComplexPaint que consegue desenhar texto, linhas,
        // imagens, gráficos, formas geométricas, etc (cada um destes desenhos teria o seu comando)
        // Por fim, outro ponto importante é que o invocador pode apresentar uma lista de
        // comandos a serem executados (por exemplo, primeiramente são todos guardados numa stack
        // e depois de X em X segundos, estes vão sendo executados). Neste exemplo isso não
        // acontece, uma vez que sempre que um comando é logo executado quando o utilizador
        // realiza uma ação

        // cria um novo desenho
        Paint paint = new Paint();
        // cria um invocador de comandos que vão realizar operações sobre o desenho
        CommandInvoker commandInvoker = new CommandInvoker();

        Image dog = new Image("dog.png", 13.5, 10.0); // imagem de um cão a ser desenhada
        // cria um comando de imagem que executa a operação de desenhar a imagem (neste caso um cão)
        commandInvoker.executeCommand(new ImageCommand(paint, dog));
        System.out.println(paint.showPainting()); // visualiza o que já está no desenho
        Thread.sleep(3000); // 3 segundos depois desenha-se outro objeto

        Line line1 = new Line(1.3, 2.6, 10.4, 11.1); // linha 1 a ser desenhada
        // cria um comando de linha que executa a operação de desenhar a linha 1
        commandInvoker.executeCommand(new LineCommand(paint, line1));
        System.out.println(paint.showPainting()); // visualiza o que já está no desenho
        Thread.sleep(2000); // 2 segundos depois desenha-se outro objeto

        Line line2 = new Line(3.5, 6.6, 3.4, 10.0); // linha 2 a ser desenhada
        // cria um comando de linha que executa a operação de desenhar a linha 2
        commandInvoker.executeCommand(new LineCommand(paint, line2));
        System.out.println(paint.showPainting()); // visualiza o que já está no desenho
        commandInvoker.unexecuteCommand(); // remove-se a última operação realizada (linha 2 é removida)
        System.out.println(paint.showPainting()); // visualiza o que já está no desenho
        Thread.sleep(5000); // 5 segundos depois desenha-se outro objeto

        Text text = new Text("It's a dog! 🐶", 7.5, 10.3); // texto a ser desenhado
        // cria um comando de texto que executa a operação de desenhar o texto
        commandInvoker.executeCommand(new TextCommand(paint, text));
        System.out.println(paint.showPainting()); // visualiza o que já está no desenho
        Thread.sleep(4000); // 4 segundos depois apaga-se tudo

        commandInvoker.unexecuteCommand(); // elimina o texto
        System.out.println(paint.showPainting()); // verifica que só tem uma linha uma imagem de um cão
        commandInvoker.unexecuteCommand(); // elimina a linha
        System.out.println(paint.showPainting()); // verifica que só tem uma imagem do cão
        commandInvoker.unexecuteCommand(); // elimina a imagem do cão
        System.out.println(paint.showPainting()); // visualiza que não tem qualquer objeto desenhado no desenho

        // No futuro, caso seja necessário novos comandos de desenho (GraphCommand, CircleCommand, etc),
        // então cria-se um novo comando e um novo objeto que representa esse desenho (Graph, Circle, etc)
        // sem ocorrer alteração nas outras classes já criadas (Open-Closed Principle!)
    }
}
