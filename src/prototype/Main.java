package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // o padrão Prototype é dos mais simples e pode ser implementado de duas formas
        // 1. Através de uma interface que declara o método clone() e de diversas classes
        //    que o implementam
        //    - Neste exemplo concreto é possível verificar a acontecer entre a interface
        //      Prototype e a classe Iq
        // 2. Atrabés de uma superclasse que declara o método clone() e de diversas
        //    subclasses que o implementam
        //    - Neste exemplo concreto é possível verificar a acontecer entre a superclasse
        //    - Robot e as subclasses CarRobot e HumanRobot
        // Também é possível ter dois tipos de clonagem:
        // - Shallow Clone: as propriedades clonadas que envolvem a palavra "new" apenas são
        //                  igualadas ao atributo que irá hospedar o mesmo. Existe um exemplo
        //                  na classe Robot quando this.battery = battery.
        // - Deep Clone: as propriedades clonadas que envolvem a palavra "new" são igualadas
        //               ao atributo que irá hospedar o mesmo, porém é necessário instanciar
        //               as mesmas. Para isso elas necessitam também de ter a possibilidade de
        //               criar clones. Existe um exemplo na classe Robot quando this.iq = new Iq(iq)
        // É importante usar este padrão quando o objeto que se recebe de uma operação é uma
        // interface, superclasse ou tem atributos necessário para a sua clonagem que se não
        // visíveis para o exterior (atributos privados sem métodos get()). Com este padrão
        // apenas delega-se a operação ao próprio objeto, uma vez que ele também conhece todos
        // os seus dados.
        // O exemplo seguinte apresenta uma fábrica de robots que apresenta 6 protótipos guardados
        // num armazém ou repositório (RobotPrototypes) e que um determinado número de clones
        // são criados a partir deles. Este clones são guardados numa coleção de Robots.
        // À medida que o tempo passa, alguns deles perdem bateria e ganham ou perdem QI, devido
        // a possíveis falhas. A bateria dos robots da mesma classe como é exatamente igual,
        // quando um perde bateria todos os outros perdem a mesma quantidade, porém o QI é
        // independente entre robots, uns perdem/ganham mais do que outros

        // lista de robots que podem ser de qualquer tipo (humanos ou carros)
        List<Robot> robots = new ArrayList<>();

        // criação do armazém/repositório de robots
        RobotPrototypes robotPrototypes = new RobotPrototypes();
        // obtém o robot protótipo da classe CR1
        Robot cr1 = robotPrototypes.getPrototype("CR1");
        if(cr1 == null){ // verifica se existe no repositório
            System.out.println("The prototype robot of class CR1 does not exist in the repository!");
        }else{ // caso exsita então criam-se 3 clones
            for(int i = 0; i < 3; i++){
                robots.add(cr1.clone());
            }
            // volta-se a adicionar o protótipo ao repositório
            robotPrototypes.addPrototype("CR1", cr1);
        }

        // obtém o robot protótipo da classe HR2
        Robot hr2 = robotPrototypes.getPrototype("HR2");
        if(hr2 == null){ // verifica se existe no repositório
            System.out.println("The prototype robot of class HR2 does not exist in the repository!");
        }else{ // caso exsita então criam-se 2 clones
            for(int i = 0; i < 2; i++){
                robots.add(hr2.clone());
            }
            // volta-se a adicionar o protótipo ao repositório
            robotPrototypes.addPrototype("HR2", hr2);
        }

        // visualização da informação dos 5 clones
        robots.forEach(r -> System.out.println(r.toString() + "\n"));
        System.out.println("The robots CR1 start losing battery and loses 30 IQ\n");
        // basta atualizar a bateria de um robot CR1 que os outros vão sofrer as alterações também
        // devido ao facto da bateria ter sido clonada via Shallow Clone
        robots.get(0).setBatteryTimeLeft(3.5);
        // o IQ do primeiro robot CR1 desce de 100 para 60, o dos restantes robots clones CR1 não descem para 60
        // devido ao facto do QI ter sido clonada via Deep Clone
        robots.get(0).setIQValue(60);
        // visualização da informação dos 5 clones (com as alterações)
        robots.forEach(r -> System.out.println(r.toString() + "\n"));

        // Como foi possível verificar, apesar dos robots serem de diferentes tipos, estes foram
        // todos tratados da mesma forma e não houve qualquer problema na invocação do método clone()
        // uma vez que não foi necessário ter acesso aos dados de um robot, nem conhecer qual o tipo
        // de robot que se quer clonar. O código cliente apenas sabe que tem que clonar

    }

}
