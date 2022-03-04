package prototype;

import java.util.HashMap;

// classe que representa um repositório de protótipos de robots sejam eles carros ou humanos
public class RobotPrototypes {

    // o repositório de protótipos de robots tem uma mapa com uma chave (identificador)
    // e o robot. Para obter um protótipo, basta fornecer a chave
    private HashMap<String, Robot> prototypes;

    // inicialização dos protótipos
    public RobotPrototypes(){
        this.prototypes = new HashMap<String, Robot>(){
            {
                put("CR1", new CarRobot("Steel", 0.50, "Red", false, new Battery(10.2), new Iq(100)));
                put("CR2", new CarRobot("Iron", 2.75, "Blue", true, new Battery(7.0), new Iq(90)));
                put("HR1", new HumanRobot("Gold", 1.55, "Gold", 10, new Battery(15.6), new Iq(30)));
                put("HR2", new HumanRobot("Diamond", 5.05, "Blue", 3, new Battery(1.95), new Iq(95)));
                put("HR3", new HumanRobot("Stone", 0.81, "Orange and Blue", 2, new Battery(30.2), new Iq(100)));
                put("CR3", new CarRobot("Sapphire", 1.37, "Dark Blue", true, new Battery(5.3), new Iq(75)));
            }
        };
    }

    // obtenção de um protótipo através da sua chave
    public Robot getPrototype(String robotPrototypeId){
        // se a chave existir então o protótipo encontra-se no repositório
        if(prototypes.containsKey(robotPrototypeId)){
            return prototypes.remove(robotPrototypeId); // remove-se o protótipo do repositório
        }
        // se a chave não existir então o protótipo não se encontra no repositório
        return null;
    }

    public void addPrototype(String robotPrototypeId, Robot robot){
        // se a chave não existir então o protótipo não se encontra no repositório
        if(!prototypes.containsKey(robotPrototypeId)){
            prototypes.put(robotPrototypeId, robot); // adiciona-se o protótipo ao repositório
        }
    }

}
