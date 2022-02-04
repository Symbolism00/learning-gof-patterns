package strategy;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // instanciação de um contexto
        AreaContext areaContext = new AreaContext();

        // criação de uma estratégia que calcula áreas de quadrados
        AreaStrategy someStrategy = new SquareArea(10.0);
        areaContext.setAreaStrategy(someStrategy); // define o contexto com a estratégia da área do quadrado
        System.out.println(areaContext.calculateArea());

        // criação de uma estratégia que calcula áreas de círculos
        someStrategy = new CircleArea(5.0);
        areaContext.setAreaStrategy(someStrategy); // define o contexto com a estratégia da área do círculo
        System.out.println(areaContext.calculateArea());

        // criação de uma estratégia que calcula áreas de triângulos
        someStrategy = new TriangleArea(10.0, 3.0);
        areaContext.setAreaStrategy(someStrategy); // define o contexto com a estratégia da área do triângulo
        System.out.println(areaContext.calculateArea());

        // retoma de uma estratégia que calcula áreas de círculos
        someStrategy = new CircleArea(33.0);
        areaContext.setAreaStrategy(someStrategy);
        System.out.println(areaContext.calculateArea());

        // o padrão strategy dá esta flexibilidade de poder alterar um contexto
        // com diferentes estratégias
        // outro ponto positivo deste padrão é que possibilita a agregação de estratégias
        // numa lista única

        Set<AreaStrategy> strategies = new HashSet<>();
        // armazenamento de diferentes estratégias no mesmo Set
        strategies.add(new SquareArea(20.0));
        strategies.add(new TriangleArea(10.0, 2.5));
        strategies.add(new TriangleArea(20.0, 10.0));
        strategies.add(new SquareArea(1.0));
        strategies.add(new CircleArea(5.5));
        // por cada estratégia vai calcular a área
        strategies.forEach(s -> System.out.println(s.execute()));

    }
}
