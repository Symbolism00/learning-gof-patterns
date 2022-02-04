package factory_method.example2;

import factory_method.KetchupPizza;
import factory_method.Pizza;

public class KetchupPizzaFactory extends PizzaFactory {

    // método responsável por instanciar pizzas de ketchup
    @Override
    public Pizza createPizza() {
        return new KetchupPizza(12, 4.75, 1);
    }
}
