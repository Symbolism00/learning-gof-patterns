package decorator;

// classe que representa um dos snacks principais, neste caso peixe
public class Fish implements Snack{

    // representa o número de peixes que vão ser comidos
    private int number;

    public Fish(int number){
        this.number = number;
    }

    // uma vez que se trata de uma refeição é preciso comer a mesma
    // o método eat() é responsável por fazer com que esta refeição seja comida
    @Override
    public void eat() {
        System.out.println("Eating " + number + " fish(es)!");
    }
}
