package observer;

// interface a ser usada pelos objetos que vão estar a observar o outro objeto que altera de X em X sec
public interface Observer {

    // executa alguma operação após ter sido notificado
    void update();

    // obtém o estado atual de cada um dos observadores (não é obrigatório ter este método)
    String currentState();
}
