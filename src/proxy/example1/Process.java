package proxy.example1;

import java.util.Date;

// classe que representa um processo com dados confidenciais entre eles:
// -> destinatário
// -> assunto
// Estes só podem ser acedidos numa determinada área por um determinado utilizador
// Os dados (número e data de registo) não são dados confidenciais e podem ser visualizados por todas os
// utilizadores. O tema apesar de não ser um dado confidencial, apenas só pode ser acedido por utilizadores
// com um determinado papel no sistema, ou seja, é uma restrição de uma restrição
// Restrições do Processo:
//       1. Acesso a todos os dados
//       2. Acesso apenas a dados não confidenciais
//            2.1. Acesso a todos os dados não confidenciais
//            2.2. Acesso a todos os dados não confidenciais exceto ao tema
public class Process implements ProxyProcess{

    // dados não confidenciais
    private Long number;
    private Date registryDate;
    private String theme;

    // dados confidenciais
    private String recipient;
    private String subject;

    // construtor que cria um processo
    public Process(Long number, Date registryDate, String theme, String recipient, String subject) {
        this.number = number;
        this.registryDate = registryDate;
        this.theme = theme;
        this.recipient = recipient;
        this.subject = subject;
    }

    // método que obtém o número do processo
    @Override
    public Long getNumber() {
        return number;
    }

    // método que obtém a data de registo do processo
    @Override
    public Date getRegistryDate() {
        return registryDate;
    }

    // método que obtém o tema do processo
    @Override
    public String getTheme() {
        return theme;
    }

    // método que obtém o destinatário do processo
    public String getRecipient() {
        return recipient;
    }

    // método que obtém o assunto do processo
    public String getSubject() {
        return subject;
    }
}
