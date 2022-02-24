package proxy.example3;

public class Main {

    public static void main(String[] args) {

        // LAZY PROXY

        // Para este tipo de proxy assume-se que o utilizador tem de selecionar
        // de um conjunto de pessoas uma pessoa e visualizar o número de amigos
        // que ela tem.
        // Sem o proxy loading, antes de se mostrar ao utilizador as informações
        // de cada pessoa, seria necessário instanciá-las. Isso faria com que algum
        // tempo fosse gasto na instanciação de cada pessoa, uma vez que no
        // construtor de cada pessoa são obtidos todos os amigos. Para o exemplo
        // existente, o processo de criação das três pessoas iria demorar 15 segundos
        // (5 segundos por cada pessoa). Posteriormente, o utilizador seleciona uma
        // pessoa, vê o número de amigos e sai da secção. Consequentemente foi gasto
        // tempo na obtenção dos amigos das outras pessoas que não foram selecionadas.
        // Para que possa ser possível retardar a obtenção dos amigos por pessoa
        // é necessário um proxy intermédio que apenas chama o método de obtenção de
        // amigos quando é necessário (na seleção de uma pessoa). Este proxy
        // apresenta os mesmos atributos (neste caso o nome, mas podia ter mais, como por
        // exemplo a idade, residência, nacionalidade, etc) que uma pessoa real para que essa
        // informação possa ser visualizada, porém não armazena qualquer informação sobre os
        // seus amigos. Quando uma pessoa é selecionada pela primeira vez, este proxy instancia
        // uma pessoa verdadeira, de modo a que todos os seus amigos sejam obtidos
        // e retorna o seu número. Esta pessoa fica guardada na cache para que no futuro caso
        // seja selecionada outra vez, então não necessita de instanciar novamente a pessoa

        // »»» Sem Proxy «««
        System.out.println("»»» Without Proxy «««");
        // obtém todas as pessoas e pede para selecionar uma
        LazyPersonProxy john = new Person("John");
        LazyPersonProxy michael = new Person("Michael");
        LazyPersonProxy simon = new Person("Simon");

        // a pessoa 1 é selecionada
        System.out.println("Number of friends of John: " + john.getNumberOfFriends());

        // »»» Com Proxy «««
        System.out.println("\n»»» With Proxy «««");
        // obtém todas as pessoas e pede para selecionar uma
        john = new PersonProxy("John");
        michael = new PersonProxy("Michael");
        simon = new PersonProxy("Simon");

        // a pessoa 1 é selecionada
        System.out.println("Number of friends of John: " + john.getNumberOfFriends());

        // mais à frente, a pessoa 1 é selecionada novamente
        System.out.println("Number of friends of John: " + john.getNumberOfFriends());

    }
}
