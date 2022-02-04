package decorator;

public class Main {

    public static void main(String[] args) {

        // criação de uma primera refeição:
        // 300g de carne
        // 50g de feijão vermelho
        // 100g de arroz carolino
        System.out.println("=== Steak Snack === ");
        Snack steakSnack = new Rice(100, "carolino",
                new Bean(50, "red", new Steak(300)));
        // come a refeição de carne toda
        steakSnack.eat();
        System.out.println("=== Steak Snack === ");

        // criação de uma segunda refeição:
        // 4 peixes
        // 100g de feijão preto
        // 100 unidades de batatas fritas que não são de pacote
        // 200g de arroz agulha
        System.out.println("\n=== Fish Snack === ");
        Snack fishSnack = new Rice(200, "agulha",
                new FrenchFries(100, false, new Bean(100, "black",
                new Fish(4))));
        // come a refeição de peixe toda
        fishSnack.eat();
        System.out.println("=== Fish Snack === ");

        // o padrão decorator permite a criação de diferentes combinações
        // entre o snack principal (carne ou peixe) e os acompanhamentos
        // (feijão, arroz ou batata frita)
        // Ex1: carne com arroz e batata frita
        // Ex2: peixe com feijão
        // Ex3: carne
        // As classes Fish e Steak não referenciam nenhum outro snack, uma vez que eles
        // representam o final da combinação (só pode haver uma comida principal)
        // As classes Bean, Rice e FrenchFries referenciam para permitir adicionar mais
        // acompanhementos à refeição
        // Uma grande vantagem deste padrão é que caso fosse necessário adicionar um
        // novo acompanhamento, bastava criar uma nova classe que desse "extends" do Garnish
        // para que fosse adicionável à "lista" de possibilidade de acompanhamentos
    }
}
