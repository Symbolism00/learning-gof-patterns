package command;

import java.util.ArrayList;
import java.util.List;

// classe que representa um invocador que vai executar comandos sem saber o que cada
// um faz ou quem é o recetor destes comandos
// Podemos pensar que o invocador é um controlo remoto com vários botões, em que cada botão
// tem um comando associado que é injetado no mesmo.
// -> Num dia os botões podem ser usados para controlar uma televisão (ligar e desligar),
//    como no dia seguinte já podem ser usados para controlar uma ventoinha (ligar e desligar).
//    Ocorreu uma troca de recetor para o mesmo controlo remoto de forma transparente,
//    apenas se alterou o tipo de comando, por exemplo TurnOnTelevisionCommand para
//    TurnOnFanCommand e TurnOffTelevisionCommand para TurnOffFanCommand
// -> Num dia os botões também podem ser usados para controlar uma televisão (ligar e desligar)
//    com um certo método, como no dia seguinte já podem ser usados para controlar uma televisão
//    (ligar e desligar) com outro método. Ocorreu uma troca transparente de implementação, porém
//    o recetor é o mesmo (a televisão), por exemplo TurnOnTelevisionImplACommand para
//    TurnOnTelevisionImplBCommand e TurnOffTelevisionImplACommand para TurnOffTelevisionImplBCommand

public class CommandInvoker {

    // stack ou queue de comandos que neste caso representam o histórico de forma sequencial,
    // isto ajuda a interpretar melhor o execute() e o unexecute()
    // caso o invocador tenha comandos fixos, cada um deles podia ser uma
    // representado como uma variável de instância em vez de uma lista
    private List<DrawCommand> commands;

    public CommandInvoker(){
        this.commands = new ArrayList<>();
    }

    // método que vai executar o comando que lhe foi passado e vai adicionar
    // ao histórico de comandos já executados
    public void executeCommand(DrawCommand command){
        commands.add(command);
        // executa o comando (cada tipo de comando terá a sua própria implmementação)
        command.execute();
    }

    // método que vai desfazer um comando anteriormente executado
    // para isso terá de ir ao histórico de comandos e remover o último da lista
    public void unexecuteCommand(){
        DrawCommand command = commands.remove(commands.size() - 1);
        // desfaz o comando (cada tipo de comando terá a sua própria implmementação)
        command.unexecute();
    }
}
