package factory_method.example1;

import factory_method.Pizza;

public class Main {

    public static void main(String[] args) {

        // assume-se que existem dois tipos de fábrica de pizzas que confecionam pizzas
        // de diferentes tipos
        // A fábrica aleatória confeciona apenas as seguintes pizzas:
        // Pizza de Fiambre -> quando o número gerado é 1
        // Pizza Havaiana -> quando o número gerado é 2
        // Pizza de Ketchup -> quando o número gerado é 3
        // A fábrica de restaurante confeciona apenas as seguinte pizzas:
        // Pizza de Ketchup -> quando têm ketchup no restaurante
        // Pizza de Chocolate -> quando não têm ketchup no restaurante
        // Como é possível verificar, cada fábrica tem a sua própria abordagem para a
        // criação de pizzas e cada uma sabe que tipo de pizzas tem de criar
        // Neste sentido, encapsula-se estas abordagens de criação nestas classes de
        // fábrica que podem ser evocadas as vezes que se quiser ao longo da aplicação
        // No futuro se se necessitar de adicionar outra fábrica (com outra abordagem)
        // basta apenas criar uma nova classe que cria diferentes tipos de pizza
        // Um problema deste exemplo do padrão Factory é que no interior de cada
        // uma das fábricas existe uma área de decisão, seja ela com if statement ou com
        // hashmap, ou seja, no futuro se se desejar adicionar uma nova pizza, ter-se-á de
        // alterar as classes (adicionar um novo if ou um novo put() no hashmap). Claramente
        // viola o princípio Open-Closed do SOLID. Este problema é ultrapassado no exemplo 2

        System.out.println("=== Método A ===");
        // cria uma pizza com o método A da fábrica aleatória
        PizzaFactory pizzaFactory = new RandomPizzaFactory();
        Pizza pizza = pizzaFactory.createPizzaMethodA();
        System.out.println(pizza.toString());

        // cria uma pizza com o método A da fábrica de restaurante
        pizzaFactory = new RestaurantPizzaFactory(true);
        pizza = pizzaFactory.createPizzaMethodA();
        System.out.println(pizza.toString());
        System.out.println("=== Método A ===");

        System.out.println("\n=== Método B ===");
        // cria uma pizza com o método B da fábrica aleatória
        pizzaFactory = new RandomPizzaFactory();
        pizza = pizzaFactory.createPizzaMethodB();
        System.out.println(pizza.toString());

        // cria uma pizza com o método B da fábrica de restaurante
        pizzaFactory = new RestaurantPizzaFactory(false);
        pizza = pizzaFactory.createPizzaMethodB();
        System.out.println(pizza.toString());
        System.out.println("=== Método B ===");
    }
}
