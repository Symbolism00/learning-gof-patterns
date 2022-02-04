package singleton;

// classe que representa um singleton, ou seja, apenas pode ser instanciado uma única vez,
// por isso a própria classe faz referência a um objeto desta classe de forma estática
public class DatabaseConnection {

    // variável que apenas é instanciada uma única vez
    private static DatabaseConnection instance;
    // assume-se que esta string faz a conexão à db
    private String connection;

    // o construtor é private fazendo com que apenas a própria classe consiga instanciar objetos
    // do tipo DatabaseConnection: "a classe instancia-se a ela mesma"
    private DatabaseConnection(String database){
        this.connection = "Conexão estabelecida com base de dados " + database;
    }

    // método de classe (método estático) que permite aceder a uma funcionalidade que esta
    // classe é responsável, neste caso apenas verifica se a variável instance já se
    // encontra instanciada, se sim, então retorna-a, se não cria-a (isto ocorre quando a
    // aplicação arranca pela primeira vez)
    // Este método pode ser evocado durante a aplicação, porém o valor de instance vai ser
    // sempre o mesmo e igual ao que foi criado pela primeira vez, ou seja, se a conexão
    // com a base de dados for MySQL, então esta vai ser sempre MySQL, pode-se evocar
    // as vezes que se quiser este método com outros tipos de database por parâmetros
    // (Oracle, H2, MongoDB, etc) que no if statement, como a instance já foi criada
    // com MySQL nunca vai fazer o new DatabaseConnection(), apenas retorna o que já existe
    public static DatabaseConnection getInstance(String database){
        if(instance == null){ // verifica se a instância já foi criada, se não então cria
            instance = new DatabaseConnection(database);
        }
        return instance; // retorna a instância criada/já exsitente (que é sempre igual à criada)
    }

    // obtém a conexão criada
    public String getConnection(){
        return connection;
    }
}
