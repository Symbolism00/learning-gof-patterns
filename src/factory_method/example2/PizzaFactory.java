package factory_method.example2;

import factory_method.Pizza;

public abstract class PizzaFactory {

    // método que coloca a pizza dentro uma caixa para ser entregue ao cliente
    // para isso necessita primeira de criar uma pizza de um determinado tipo
    // e de seguida empacotá-la dentro de uma Box
    public Box boxPizza(){
        Pizza pizza = createPizza();
        return new Box(pizza);
    }

    // método abstrato que será implementado pelas diferentes fábricas, uma vez que elas
    // sabem qual é a pizza que têm que instanciar (têm essa responsabilidade)
    public abstract Pizza createPizza();
}
