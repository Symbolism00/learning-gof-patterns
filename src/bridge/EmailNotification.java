package bridge;

// classe concreta que contém a implementação de um envio de uma notificação
// por email, neste contexto, a notificação não tem conhecimento se vai enviar
// email para uma pessoa ou para uma empresa, apenas sabe que vai enviar para
// uma entidade e que para isso necessita da sua descrição e do seu email
public class EmailNotification implements Notification{

    // tem uma referência à entidade por composição, para que seja permitido
    // ter um notificador de emails de diferentes tipos de entidades
    private Entity entity;

    public EmailNotification(Entity entity){
        this.entity = entity;
    }

    @Override
    public void send() {
        // obtém a descrição da entidade que pode variar de entidade para entidade
        String entityDescription = entity.getDescription();
        // obtém o email da entidade que pode ser obtida de qualquer forma
        String serviceEmail = entity.getServiceEmail();

        // envia a notificação por email
        System.out.println("»»» Sending email notification\nDescription: " + entityDescription + "\nTo email: " + serviceEmail);

    }
}
