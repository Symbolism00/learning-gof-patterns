package factory_method.example2;

import factory_method.ChocolatePizza;
import factory_method.Pizza;

public class ChocolatePizzaFactory extends PizzaFactory {

    // método responsável por instanciar pizzas de chocolate
    @Override
    public Pizza createPizza() {
        return new ChocolatePizza(6, 5, 200);
    }
}
