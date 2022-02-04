package factory_method.example1;

import factory_method.Pizza;

// fábrica de pizzas que apresenta 2 métodos diferentes da instanciação simples deste padrão
public interface PizzaFactory {

    // método A que utiliza if statements
    Pizza createPizzaMethodA();

    // método B que utiliza um hashmap que contém todas as possibilidades
    Pizza createPizzaMethodB();
}
