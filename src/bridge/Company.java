package bridge;

import java.util.List;

// classe que representa uma entidade, neste caso uma empresa que contém
// diversas informações sobre a mesma
public class Company {

    // uma empresa tem uma designação (nome da empresa)
    private String designation;
    // lista de contactos que podem enviar mensagens uma lista com três
    // contactos indica que a partir destes 3 números é possível enviar mensagens
    private List<Long> companyMessageNumbers;
    // indice que indica qual é o email de expedição que deve ser usado
    // os emails de receção encontram-se numa estrurura à parte e independente, por exemplo
    private int emailIndexRepo;

    public Company(String designation, List<Long> companyMessageNumbers, int emailIndexRepo){
        this.designation = designation;
        this.companyMessageNumbers = companyMessageNumbers;
        this.emailIndexRepo = emailIndexRepo;
    }

    // obtém a designação da empresa
    public String getDesignation() {
        return designation;
    }

    // obtém os contactos para o envio de mensagens
    public List<Long> getCompanyMessageNumbers() {
        return companyMessageNumbers;
    }

    // obtém o índice do email de receção a ser usado na empresa
    public int getEmailIndexRepo() {
        return emailIndexRepo;
    }
}
