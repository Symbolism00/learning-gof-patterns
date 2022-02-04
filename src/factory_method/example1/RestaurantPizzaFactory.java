package factory_method.example1;

import com.sun.org.apache.xpath.internal.operations.Bool;
import factory_method.*;

import java.util.HashMap;
import java.util.Map;

// tipo de fábrica concreta que consoante o valor de hasKetchup cria um determinado tipo de pizza
public class RestaurantPizzaFactory implements PizzaFactory{

    // hashmap que contém todas as possibilidades de pizza que esta fábrica pode criar
    // chave -> boolean que indica se há ou não ketchup
    // valor -> tipo de pizza a ser criado
    static Map<Boolean, Pizza> pizzaTypes = new HashMap(){
        {
            put(Boolean.TRUE, new KetchupPizza(10, 10.5, 10));
            put(Boolean.FALSE, new ChocolatePizza(10, 10.5, 3000));
        }
    };

    // variável de instância que indica se o restaurante tem ou não ketchup
    private final boolean hasKetchup;

    public RestaurantPizzaFactory(boolean hasKetchup){
        this.hasKetchup = hasKetchup;
    }

    // possível método A de fábrica que requer o uso de if statements de modo a poder decidir
    // qual o tipo de pizza que se quer criar
    @Override
    public Pizza createPizzaMethodA() {
        // se tiver ketchup então cria um pizza de ketchup
        if(hasKetchup){
            return new KetchupPizza(20, 20, 10);
        }
        // se não tiver ketchup então cria um pizza de chocolate
        return new ChocolatePizza(100, 300, 3000);
    }

    // possível método B de fábrica em que utiliza um hashmap com as diferentes opções já definidas
    // uma vez que o if é boolean, este método não seria necessário, porém é apresentado
    // com o objetivo de dar outra visão sobre a instanciação deste padrão
    @Override
    public Pizza createPizzaMethodB() {
        return pizzaTypes.get(hasKetchup);
    }
}
