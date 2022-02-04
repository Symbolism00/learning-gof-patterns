package decorator;

// acompanhamento para a refeição que vai ser criada
public abstract class Garnish implements Snack{

    // um acompanhamento pode conter outros acompanhamentos
    // o snack principal (ex: carne ou peixe)
    protected Snack garnish;
    // um acompanhamento representa uma quantidade em que a unidade (ex: kg, g, unidade)
    // pode variar de acompanhento para acompanhamento
    protected int quantity;

    protected Garnish(int quantity, Snack garnish){
        this.quantity = quantity;
        this.garnish = garnish;
    }
}
