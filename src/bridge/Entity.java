package bridge;

// interface com os diferentes métodos que os diferentes tipos de entidade terão de implementar.
// Num contexto de notificação é importante as entidades disponibilizarem a sua descrição, o seu
// contacto telefónico e o seu email. Salienta-se que cada implementação varia de entidade para
// entidade
public interface Entity {

    // obtém a descrição de uma entidade
    String getDescription();
    // obtém o contacto telefónico de uma entidade
    long mainPhoneCommunicationNumber();
    // obtém o email de serviço de uma entidade
    String getServiceEmail();
}
