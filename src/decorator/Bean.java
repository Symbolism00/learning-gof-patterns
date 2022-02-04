package decorator;

public class Bean extends Garnish{

    // os feijões podem ser de cor vermelho, branco ou preto
    private String color;

    public Bean(int quantity, String color, Snack garnish){
        super(quantity, garnish);
        this.color = color;
    }

    // tal como todos os acompanhamentos estes têm de ser comidos
    @Override
    public void eat() {
        System.out.println("Eating " + quantity + "g of " + color + " beans!");
        garnish.eat();
    }
}
