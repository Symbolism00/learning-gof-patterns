package decorator;

// classe que representa um dos snacks principais, neste caso carne
public class Steak implements Snack{

    // a quantidade de carne a ser comida é dada em gramas
    private int quantity;

    public Steak(int quantity){
        this.quantity = quantity;
    }

    // uma vez que se trata de uma refeição é preciso comer a mesma
    // o método eat() é responsável por fazer com que esta refeição seja comida
    @Override
    public void eat() {
        System.out.println("Eating " + quantity + "g of steak!");
    }
}
