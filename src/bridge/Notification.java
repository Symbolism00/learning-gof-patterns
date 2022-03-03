package bridge;

// interface que os diferentes tipos de notificações vão ter de implementar.
// Esta interface combinada com a interface Entity criam a ponte (Bridge) que é
// feita entre os tipos de notificações e os tipos de entidade.
// A ponte permite combinar diferentes tipos de notificações com diferente tipos
// de entidade, por exemplo:
// - Notificar por email (o email é criado da mesma forma para uma pessoa e empresa, porém a forma
// como os dados de uma pessoa e de uma empresa são obtidos é diferente):
//      - Uma pessoa (O email de uma pessoa é um atributo do objeto do tipo Pessoa e por isso basta fazer get())
//      - Uma empresa (O email de receção de uma empresa é externo e é necessário realizar diversos processos
//                     antes de obter o email)
// A mesma lógica aplica-se para a notificação por SMS
public interface Notification {

    // método comum que qualquer tipo de notificação (seja ela por email ou SMS) terá de ter
    void send();
}
