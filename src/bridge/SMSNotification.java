package bridge;

// classe concreta que contém a implementação de um envio de uma notificação
// por SMS, neste contexto, a notificação não tem conhecimento se vai enviar
// SMS para o contacto de uma pessoa ou empresa, apenas sabe que vai enviar para
// uma entidade e que para isso necessita do seu contacto
public class SMSNotification implements Notification{

    // tem uma referência à entidade por composição, para que seja permitido
    // ter um notificador de SMSs de diferentes tipos de entidades
    private Entity entity;

    public SMSNotification(Entity entity){
        this.entity = entity;
    }

    @Override
    public void send() {
        // obtém o contacto telefónico que pode ser obtido de qualquer forma
        long phoneNumber = entity.mainPhoneCommunicationNumber();

        // envia notificação por sms
        System.out.println("»»» Sending SMS notification\nTo number: " + phoneNumber);
    }
}
