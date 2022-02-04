package factory_method.example1;

import factory_method.HamPizza;
import factory_method.HawaiianPizza;
import factory_method.KetchupPizza;
import factory_method.Pizza;

import java.util.HashMap;
import java.util.Map;

// tipo de fábrica concreta que consoante o valor aleatório obtido cria um determinado tipo de pizza
public class RandomPizzaFactory implements PizzaFactory {

    // hashmap que contém todas as possibilidades de pizza que esta fábrica pode criar
    // chave -> número aleatório
    // valor -> tipo de pizza a ser criado
    static Map<Integer, Pizza> pizzaTypes = new HashMap(){
        {
            put(1, new HamPizza(10, 10.5, "pork"));
            put(2, new HawaiianPizza(10, 10.5, 1));
            put(3, new KetchupPizza(10, 10.5, 5));
        }
    };

    // possível método A de fábrica que requer o uso de if statements de modo a poder decidir
    // qual o tipo de pizza que se quer criar
    @Override
    public Pizza createPizzaMethodA() {
        // obtém o número aleatório
        int rNumber = (int) (Math.random() * 3) + 1;
        // caso o número seja 1 então cria um pizza de fiambre
        if(rNumber == 1){
            return new HamPizza(10, 10.5, "pork");
        }
        // caso o número seja 2 então cria um pizza havaiana
        if(rNumber == 2){
            return new HawaiianPizza(10, 10.5, 1);
        }
        // caso o número seja 3 então cria um pizza de ketchup
        if(rNumber == 3){
            return new KetchupPizza(10, 10.5, 5);
        }
        // se o número não for nenhum dos 3 então retorna null
        return null;
    }

    // possível método B de fábrica em que utiliza um hashmap com as diferentes opções já definidas
    @Override
    public Pizza createPizzaMethodB() {
        // obtém o número aleatório
        int rNumber = (int) (Math.random() * 3) + 1;
        // obtém o valor da respetiva chave (valor aleatório)
        return pizzaTypes.get(rNumber);
    }
}
