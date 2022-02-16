package facade;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // O padrão Facade é dos mais simples uma vez que grande parte das
        // pessoas já aplicava o mesmo (de forma correta ou não). Pelo menos
        // o seu principal objetivo que é reduzir código repetido e a
        // esconder a complexidade de implementação. A grande maioria quando
        // percebia que um bloco de código era muito complexo e tornava-se
        // muito repetitivo ao longo do sistema, encapsulavam esse código
        // numa classe ou função à parte. Assim, sempre que fosse necessário
        // executar essa operação, bastava chamar o método dessa classe ou função.
        // Praticamente estão a aplicar este padrão sem terem conhecimento.
        // Com o objetivo de entender este padrão com um exemplo real usa-se o
        // exemplo de uma casa. Uma casa no seu interior é complexa, porque tem fios,
        // canalizações, tubos, etc. Uma pessoa que se encontra do lado de fora da
        // casa não lhe interessa ver toda essa complexidade, para isso existe a
        // fachada da casa que esconde isso tudo. A pessoa apenas vê a fachada.
        // Na programação, este padrão funciona de forma idêntica, a pessoa (código cliente)
        // vê a Fachada da casa (classe Facade) que esconde toda a complexidade entre fios,
        // canalizações, tubos, etc (associações, instanciações, chamadas de métodos).
        // De forma a executar alguma operação a classe Facade permite através do acesso a métodos simples

        // código cliente 1 que necessita de realizar todas as operações que a Facade disponibiliza
        useFacadeClientOne();
        // código cliente 2 que necessita de realizar algumas operações que a Facade disponibiliza
        useFacadeClientTwo();
        // código cliente 3 que necessita de realizar algumas operações que a Facade disponibiliza
        useFacadeClientThree();

        // com a Facade esconde-se a complexidade de uma operação, mas também remove-se
        // muito código repretido (consequência dessa complexidade), uma vez que apenas
        // basta instanciar a Facade e chamar os métodos que disponibiliza

    }

    private static void useFacadeClientOne(){

        Set<Character> charList = new TreeSet<>();
        charList.add('a');
        charList.add('b');
        charList.add('c');

        // instancia uma Facade e chama os métodos simples, não necessita
        // de ter qualquer conhecimento sobre o que está por trás de cada um
        ComplexSubSystemFacade complexSubSystemFacade = new ComplexSubSystemFacade();
        complexSubSystemFacade.executeOperation1("example");
        complexSubSystemFacade.executeOperation2(2.0, '\r', "example");
        complexSubSystemFacade.executeOperation3(10, 20);
        complexSubSystemFacade.executeOperation4();
        complexSubSystemFacade.executeOperation5(3542);
        complexSubSystemFacade.executeOperation6(charList, 9.5, 15);
        complexSubSystemFacade.executeOperation7();

    }

    private static void useFacadeClientTwo(){

        // instancia uma Facade e chama os métodos simples, não necessita
        // de ter qualquer conhecimento sobre o que está por trás de cada um
        ComplexSubSystemFacade complexSubSystemFacade = new ComplexSubSystemFacade();
        complexSubSystemFacade.executeOperation2(2.0, '\r', "another example");
        complexSubSystemFacade.executeOperation4();

    }

    private static void useFacadeClientThree(){

        Set<Character> charList = new TreeSet<>();
        charList.add('\t');
        charList.add('?');

        // instancia uma Facade e chama os métodos simples, não necessita
        // de ter qualquer conhecimento sobre o que está por trás de cada um
        ComplexSubSystemFacade complexSubSystemFacade = new ComplexSubSystemFacade();
        complexSubSystemFacade.executeOperation1("another example");
        complexSubSystemFacade.executeOperation5(9762110);
        complexSubSystemFacade.executeOperation6(charList, 0.23, 10000);
    }
}
