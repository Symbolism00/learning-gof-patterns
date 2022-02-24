package proxy.example3;

// proxy que declara o método que deve servir para que o lazy loading seja aplicado.
// Neste caso, apenas quando se pede o número de amigos, é que a lista de amigos
// deve ser carregada para memória
public interface LazyPersonProxy {

    int getNumberOfFriends();
}
