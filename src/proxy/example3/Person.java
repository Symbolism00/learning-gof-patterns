package proxy.example3;

import java.util.ArrayList;
import java.util.List;

// classe que representa um entidade
public class Person implements LazyPersonProxy{

    // na forma mais simples uma pessoa é constituída por um nome e uma lista de amigos
    private String name;
    // lista de amigos referem outras pessoas
    private List<Person> friends;

    // quando uma pessoa é instanciada, todos os seus amigos também o são
    // e essa operação é muito custosa em termos de performance devido à quantidade de relações
    public Person(String name){
        this.name = name;
        getFriends();
    }

    // método que obtém todos os amigos de uma pessoa quando esta é instanciada
    private void getFriends(){
        this.friends = new ArrayList<>();
        // para termos de teste só demora 5 segundos
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // operação muito grande e pesada
        System.out.println("Friends of " + name + " loaded");
    }

    // retorna o número de amigos
    public int getNumberOfFriends(){
        return friends.size();
    }
}
