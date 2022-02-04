package factory_method.example2;

import factory_method.HawaiianPizza;
import factory_method.Pizza;

public class HawaiianPizzaFactory extends PizzaFactory {

    // método responsável por instanciar pizzas havaianas
    @Override
    public Pizza createPizza() {
        return new HawaiianPizza(20, 10, 30);
    }
}
