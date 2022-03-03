package bridge;

// classe concreta que representa um adaptador para um tipo de entidade,
// neste caso para uma empresa
public class CompanyEntity implements Entity {

    // o contacto na posição 4 da lista de contactos da empresa é responsável
    // pela receção de notificações via SMS
    private static final int NOTIFICATION_CONTACT_INDEX = 3;
    // como é um adaptador de empresas, então refere uma empresa
    private Company company;

    public CompanyEntity(Company company){
        this.company = company;
    }

    @Override
    public String getDescription() {
        // no contexto da notificação a designação da empresa é a descrição
        return this.company.getDesignation();
    }

    @Override
    public long mainPhoneCommunicationNumber() {
        // o quarto contacto da lista de contactos da empresa é responsável
        // por receber notificações
        return this.company.getCompanyMessageNumbers().get(NOTIFICATION_CONTACT_INDEX);
    }

    @Override
    public String getServiceEmail() {
        int emailIndex = this.company.getEmailIndexRepo();
        // obtém o email de serviço num repositório externo
        return EmailStaticRepository.emails.get(emailIndex);
    }
}
