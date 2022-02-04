package abstract_factory;

public class Main {

    public static void main(String[] args) {

        // Assume-se que se quer criar desportos e que para isso é necessário
        // saber qual é o objeto jogável e a principal componente de cada um dos
        // diferente desportos que se podem criar (Ténis, Futebol e Hóquei no Gelo)
        // -> O desporto Ténis só faz sentido existir se o seu objeto jogável for
        // uma bola e se a componente principal for uma rede
        // -> O desporto Futebol só faz sentido existir se o seu objeto jogável for
        // uma bola e se a componente principal for uma baliza
        // -> O desporto Hóquei no Gelo só faz sentido existir se o seu objeto jogável for
        // um disco de hóquei e se a componente principal for uma baliza
        // Como é possível verificar, cada desporto tem as suas próprias características
        // Este padrão Abstract Factory permite instanciar objetos que façam sentido
        // num determinado contexto. Por exemplo, quando se quer criar o desporto
        // Ténis, a fábrica TennisFactory disponibiliza dois métodos um que cria uma
        // bola (objeto jogável) e outro que cria uma rede (componente) e apenas essa combinação.
        // Uma fábrica de ténis não permite a criação de um disco de hóquei com uma rede,
        // porque isso não faz sentido no contexto do desporto ténis.
        // Os objetos jogáveis e componentes podem ser combinadas entre si para as diferentes
        // fábricas, nos exemplos seguintes os seguintes casos ocorrem:
        // -> TennisFactory: Ball + Net
        // -> SoccerFactory: Ball + Goal
        // -> HockeyFactory: Disk + Goal
        // Apesar dos objetos serem os mesmo, cada um tem as suas próprias características
        // uma baliza de futebol é maior que uma baliza de hóquei e uma bola de futebol é maior
        // que uma bola de ténis.
        // No futuro, caso seja necessário criar um novo desporto que utilize como objeto jogável
        // um disco de hóquei e como componente uma rede apenas basta criar essa fábrica
        // em que o método createPlayableObject() retorna um Disk e o createComponentObject()
        // retorna uma Net, sem que seja necessário alterar as outras classes existentes
        // Também é possível no futuro adicionar novos objetos jogáveis e componentes e
        // combinar entre eles (para isso também será necessário novas fábricas asbtratas!)
        // O Abstract Factory é semelhante ao exemplo 2 do Factory Method porém permite
        // combinar diferentes objetos que podem pertencer à mesma família de classes
        // (mesma superclasse) ou diferentes famílias (diferentes superclasses)

        // criação do desporto ténis
        System.out.println("=== Tennis ===");
        SportFactory sportFactory = new TennisFactory(); // criação da fábrica de ténis que sabe o que criar
        PlayableObject playableObject = sportFactory.createPlayableObject(); // cria uma bola
        ComponentObject componentObject = sportFactory.createComponentObject(); // cria uma rede
        System.out.println(playableObject.toString());
        System.out.println(componentObject.toString());
        // usar um pouco de polimorfismo, uma vez que o objeto retornado da fábrica é um playable object
        // o facto de ressaltar depende do tipo de objeto criado
        System.out.println(playableObject.bounce() ? "The playable object bounces!!" : "The playable object does not bounce ");

        // criação do desporto futebol
        System.out.println("\n=== Soccer ===");
        sportFactory = new SoccerFactory(); // criação da fábrica de futebol que sabe o que criar
        playableObject = sportFactory.createPlayableObject(); // cria uma bola
        componentObject = sportFactory.createComponentObject(); // cria uma baliza
        System.out.println(playableObject.toString());
        System.out.println(componentObject.toString());
        // usar um pouco de polimorfismo, uma vez que o objeto retornado da fábrica é um playable object
        // o facto de ressaltar depende do tipo de objeto criado
        System.out.println(playableObject.bounce() ? "The playable object bounces!!" : "The playable object does not bounce ");

        // criação do desporto hóquei no gelo
        System.out.println("\n=== Hockey ===");
        sportFactory = new HockeyFactory(); // criação da fábrica de hóquei que sabe o que criar
        playableObject = sportFactory.createPlayableObject(); // cria um disco
        componentObject = sportFactory.createComponentObject(); // cria uma baliza
        System.out.println(playableObject.toString());
        System.out.println(componentObject.toString());
        // usar um pouco de polimorfismo, uma vez que o objeto retornado da fábrica é um playable object
        // o facto de ressaltar depende do tipo de objeto criado
        System.out.println(playableObject.bounce() ? "The playable object bounces!!" : "The playable object does not bounce ");

    }
}
