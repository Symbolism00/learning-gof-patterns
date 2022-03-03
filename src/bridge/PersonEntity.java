package bridge;

// classe concreta que representa um adaptador para um tipo de entidade,
// neste caso para uma pessoa
public class PersonEntity implements Entity {

    // como é um adaptador de pessoas, então refere uma pessoa
    private Person person;

    public PersonEntity(Person person){
        this.person = person;
    }

    @Override
    public String getDescription() {
        // no contexto da notificação a designação da pessoa é o primeiro e último nome
        return this.person.getFirstName() + " " + this.person.getLastName();
    }

    @Override
    public long mainPhoneCommunicationNumber() {
        // obtém o contacto da pessoa
        return this.person.getPhoneNumber();
    }

    @Override
    public String getServiceEmail() {
        // obtém o email da pessoa
        return this.person.getEmail();
    }
}
