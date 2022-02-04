package abstract_factory;

// interface que representa a fábrica geral para a instanciação de desportos
// todas as fábricas de desporto devem implementar esta interface de modo
// a que eles possam produzir os objetos que fazem sentido existirem no desporto
// que estão a criar
public abstract interface SportFactory {

    // método que cada fábrica concreta vai implementar para criar um determinado objeto jogável
    // dependendo do contexto em que se encontra
    PlayableObject createPlayableObject();

    // método que cada fábrica concreta vai implementar para criar uma determinada componente
    // dependendo do contexto em que se encontra
    ComponentObject createComponentObject();

}
