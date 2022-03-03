package bridge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // para a aplicação deste padrão Bridge assume-se que se está a desenvolver um
        // sistema de notificações e que atualmente só existem dois tipos de notificações,
        // sendo eles por email e por SMS. No futuro poderão existir mais, por exemplo
        // notificações pelo aplicativo Demo. No sistema existem diversos tipos de entidades
        // que têm a sua própria representação dos dados ou têm guardados em sistemas externos,
        // como é o caso dos emails das empresas. Estas entidades também podem aumentar no
        // futuro, por exemplo, poderá a existir uma nova entidade Test que tem uma
        // estrutura única de representação/persistência de dados. Os diferentes tipos de
        // notificação podem notificar qualquer tipo de entidade, logo o número de combinações
        // possíveis é o seguinte:
        // - Notificar por email uma pessoa
        // - Notificar por email uma empresa
        // - Notificar por SMS uma pessoa
        // - Notificar por SMS uma empresa
        // - Notificar por email a Test (no futuro)
        // - Notificar por SMS a Test (no futuro)
        // - Notificar pelo aplicativo Demo uma pessoa (no futuro)
        // - Notificar pelo aplicativo Demo uma empresa (no futuro)
        // - Notificar pelo aplicativo Demo uma TestEnitty (no futuro)
        // 1. Uma possível solução seria colocar toda esta lógica de envio de notificações
        //    numa única classe, porém iria estar a violar o SRP (Single Responsibility Principle) e
        //    o Open-Closed Principle.
        // 2. Outra possível solução seria criar uma classe para cada tipo de combinação. Apesar
        //    de ser uma solução que não viola nenhum dos principios anteriores, ela cresce
        //    exponencialemnte ou fatorialmente, com as notificações Email e SMS + entidades Pessoa e Empresa
        //    o número de classes a criar seria 4 = 2!. Com a adição da notificação pelo aplication Demo e
        //    da entidade Test o número de classes a criar seria 9 = 3!
        // 3. Com o objetivo de evitar esse crescimento é preciso ter em consideração o padrão Bridge que apenas
        //    permite a criação de classes concretas relativas aos tipos de notificações e de classes concretas
        //    relativas aos tipos de entidades. Cada tipo de notificação vai por composição associar um tipo
        //    de entidade através da sua interface, o que permite fazer com que uma notificação X possa notificar
        //    tipos de entidades A, B, C, D, E, F, etc.
        // No exemplo seguinte foram apenas necessárias 4 classes para tratar das combinações entre tipos de
        // notificação e tipos de entidade. De facto, com a solução 2 o número de classes seria a mesma, porém
        // no futuro se se adicionar um novo tipo de notificação (aplicativo Demo) e tipo de entidade (Test)
        // o número de classes será 6 (adicionavam-se as classes ApplicationDemoNotification e TestEntity)
        // enquanto que com a segunda solução seria 9.

        // cria uma empresa e o seu adapter (CompanyEntity)
        List<Long> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(12345678L);
        phoneNumbers.add(17261762L);
        phoneNumbers.add(98437344L);
        phoneNumbers.add(26473276L);
        phoneNumbers.add(28918000L);
        Company company = new Company("Test Company .Lda", phoneNumbers, 91);
        // engloba a empresa num adaptador CompanyEntity
        Entity companyEntity = new CompanyEntity(company);

        // cria uma pessoa e o seu adapter (PersonEntity)
        Person person = new Person("John", "Styles", 46502908L, "person@per.com", 20);
        // engloba a pessoa num adaptador PersonEntity
        Entity personEntity = new PersonEntity(person);

        // notificações para a empresa
        System.out.println("Company Notifications");
        // como se está a passar um CompanyEntity para um SMSNotification, quando este for executar
        // o método send(), o mainPhoneCommunicationNumber() será o quarto contacto da empresa
        Notification smsCompanyNotification = new SMSNotification(companyEntity);
        // como se está a passar um CompanyEntity para um EmailNotification, quando este for executar
        // o método send(), o getDescription() retornará o nome da empresa e getServiceEmail() o email
        // que tem o índice X no sistema externo
        Notification emailCompanyNotification = new EmailNotification(companyEntity);
        smsCompanyNotification.send(); // notifica por SMS
        emailCompanyNotification.send(); // notifica por email

        // notificações para a pessoa
        System.out.println("\nPerson Notifications");
        // como se está a passar um PersonEntity para um SMSNotification, quando este for executar
        // o método send(), o mainPhoneCommunicationNumber() será o contacto pessoal da entidade
        Notification smsPersonNotification = new SMSNotification(personEntity);
        // como se está a passar um PersonEntity para um EmailNotification, quando este for executar
        // o método send(), o getDescription() retornará o primeiro e último nome da pessoa e o
        // getServiceEmail() o email pessoal da entidade
        Notification emailPersonNotification = new EmailNotification(personEntity);
        smsPersonNotification.send(); // notifica por SMS
        emailPersonNotification.send(); // notifica por email
    }
}
