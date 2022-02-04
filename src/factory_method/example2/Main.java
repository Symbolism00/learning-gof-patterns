package factory_method.example2;

public class Main {

    public static void main(String[] args) {

        // o exemplo 2 já faz o uso da abstração, permitindo as diferentes subclasses
        // fábrica instanciarem o objeto que que lhes compete. Todas as pizzas
        // precisam de ser colocadas dentro de uma caixa para serem entregues, ou seja,
        // é um processo comum a todos os tipos de pizza por isso esse método
        // encontra-se na fábrica genérica. Já a criação da pizza pode depender do tipo
        // de fábrica: se for uma fábrica de pizzas de fiambre então a HamPizzaFactory
        // terá a responsabilidade de aa criar. Por isso o método createPizza() é
        // abstrato, porque as subclasses da fábrica genérica é que sabem que tipo de pizza criar
        // Com isto é possível verificar que as estruturas de decisão foram eliminadas
        // e no futuro, caso seja necessário criar um novo tipo de pizza, basta criar a sua
        // fábrica e esta retornar esse tipo de pizza deixando intactas as outras classes
        // este exemplo podia-se ter aplicado no exemplo 1, porém no exemplo 1 mostra-se
        // uma fábrica por abordagem (abordagem aleatória e abordagem de restaurante) enquanto
        // que neste exemplo as fábricas são direcionadas para a instanciação de um tipo de pizza

        // empacotamento de uma pizza de fiambre
        PizzaFactory pizzaFactory = new HamPizzaFactory(); // esta fábrica apenas instanciará pizzas de fiambre
        Box box = pizzaFactory.boxPizza();
        System.out.println(box.whatsInsideTheBox());

        // empacotamento de uma pizza de chocolate
        pizzaFactory = new ChocolatePizzaFactory(); // esta fábrica apenas instanciará pizzas de chocolate
        box = pizzaFactory.boxPizza();
        System.out.println(box.whatsInsideTheBox());

        // empacotamento de uma pizza de kecthup
        pizzaFactory = new KetchupPizzaFactory(); // esta fábrica apenas instanciará pizzas de ketchup
        box = pizzaFactory.boxPizza();
        System.out.println(box.whatsInsideTheBox());

        // empacotamento de uma pizza havaiana
        pizzaFactory = new HawaiianPizzaFactory(); // esta fábrica apenas instanciará pizzas havaianas
        box = pizzaFactory.boxPizza();
        System.out.println(box.whatsInsideTheBox());
    }
}
