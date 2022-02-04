package decorator;

// classe que representa um dos acompanhamentos, neste caso batatas fritas
public class FrenchFries extends Garnish {

    // podem ser de pacote ou não
    private boolean packet;

    public FrenchFries(int quantity, boolean packet, Snack garnish){
        super(quantity, garnish);
        this.packet = packet;
    }

    // tal como todos os acompanhamentos estes têm de ser comidos
    @Override
    public void eat() {
        System.out.println("Eating " + quantity + " french fries" + (packet ? " from packet!" : "!"));
        garnish.eat();
    }
}
