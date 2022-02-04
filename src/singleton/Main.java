package singleton;

public class Main {

    public static void main(String[] args) {

        // arranca-se pela primeira vez a aplicação e a conexão a ser criada é MySQL
        DatabaseConnection dbConnection = DatabaseConnection.getInstance("MySQL");
        System.out.println(dbConnection.getConnection()); // verifica que é MySQL

        // agora tenta-se criar uma nova conexão com a base de dados Oracle
        dbConnection = DatabaseConnection.getInstance("Oracle");
        // verifica-se que a conexão continua a ser MySQL, porque a variável instance
        // já tinha sido criada anteriormente com conexão a MySQL
        System.out.println(dbConnection.getConnection());

        // mais uma vez tenta-se criar uma nova conexão com a base de dados MongoDB
        dbConnection = DatabaseConnection.getInstance("MongoDB");
        System.out.println(dbConnection.getConnection()); // mais uma vez, MySQL persiste

        // O padrão Singleton é muito simples e útil em alguns casos, um deles por exemplo
        // as conexões com a base de dados, para não permitir que várias conexões
        // sejam criadas em paralelo. No entanto, também apresenta alguns pontos negativos,
        // por exemplo:
        // -> Permite um ponto de acesso global: qualquer classe pode obter o valor de instance
        //    em qualquer local da aplicação, basta fazer DatabaseConnection.getInstance();
        // -> Classes ficam dependentes desta classa concreta: outras classes que evocam
        //    o método getInstance() estão essencialmente a fazer "new DatabaseConnection()"
        // -> Complexidade ao testar: o facto da Singleton não implementar qualquer interface
        //    e de ter métodos estáticos torna complicado de criar um Mock da classe quando
        //    se for fazer testes unitários

    }
}
