package factory_method.example2;

import factory_method.HamPizza;
import factory_method.Pizza;

public class HamPizzaFactory extends PizzaFactory {

    // método responsável por instanciar pizzas de fiambre
    @Override
    public Pizza createPizza() {
        return new HamPizza(10, 5.5, "turkey");
    }
}
