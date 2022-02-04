package decorator;

// classe que representa um dos acompanhamentos, neste caso arroz
public class Rice extends Garnish {

    // o arroz é de um tipo ex: agulha, carolino
    private String type;

    public Rice(int quantity, String type, Snack garnish){
        super(quantity, garnish);
        this.type = type;
    }

    // tal como todos os acompanhamentos estes têm de ser comidos
    @Override
    public void eat() {
        System.out.println("Eating " + quantity + "g of " + type + " rice!");
        garnish.eat();
    }
}
