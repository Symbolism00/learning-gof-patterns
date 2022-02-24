package proxy.example3;

// proxy concreto que "se faz passar por uma pessoa", a classe é muito idêntica
// à classe pessoa, porém no seu construtor não obtém todos os amigos
public class PersonProxy implements LazyPersonProxy{

    // aponta para a verdadeira classe pessoa
    private Person person;
    // atributo necessário para criar uma pessoa
    private String name;

    // esta classe proxy faz-se passar por uma Person, ou seja, é construída da mesma
    // forma (tem os mesmos) argumentos, porém adia a obtenção de todos os amigos de uma
    // pessoa. Em vez dessa operação existir no seu construtor, existe num método à parte
    public PersonProxy(String name){
        this.name = name;
    }

    // obtém todos os amigos de uma pessoa somente quando este método é chamado.
    @Override
    public int getNumberOfFriends() {
        // este tipo de proxy também permite guardar dados em cache, neste caso se a pessoa
        // já existir então evita novamente a sua criação
        if(this.person == null){
            this.person = new Person(name); // se não existir então cria uma pessoa
        }
        // se existir então apenas retorna o número de amigos
        return this.person.getNumberOfFriends();
    }
}
