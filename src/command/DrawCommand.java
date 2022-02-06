package command;

// interface que permite que vários tipos de comando trabalhem de igual forma
// cada comando tem o seu método execute() que realiza uma determinada operação
// cada comando também tem o seu método unexecute() que realiza uma determinada operação
public interface DrawCommand {

    // operação a ser realizada quando um comando é ativado (faz algo)
    void execute();

    // operação a ser realizada quando um comando é ativado (desfaz algo)
    void unexecute();
}
