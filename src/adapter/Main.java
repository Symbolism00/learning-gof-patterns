package adapter;

public class Main {

    public static void main(String[] args) {

        // supõe-se que um utilizador comprou uma aparafusadora nova e que tem diferentes
        // tipos de parafusos em casa (parafusos de fenda e parafusos em estrela).
        // A aparafusadora quando é comprada contém uma chave que não é suportada nos
        // tipos de parafuso. Assume-se que a chave é circular. Consequentemente, quando
        // se tenta encaixar um parafuso nesta chave está-se pertante duas interfaces incompatíveis.
        // Por exemplo:
        // Chave Circular => Interface cirular ---x--- Interface em Estrela <= Parafuso em Estrela
        // Chave Circular => Interface cirular ---x--- Interface Retangular <= Parafuso de Fenda
        // Como é possível verificar, o processo de aparafusamento fica impossível quando
        // se está a trabalhar com interfaces diferentes. De modo a que seja possível
        // prosseguir com o processo, é necessário ter um adaptador para cada tipo de interface,
        // ou seja, um adaptador para parafusos em estrela e um adaptador para parafusos de fenda.
        // Estes adaptadores vão ser colocados (chamados) pela aparafusadora e como input
        // terão a interface circular, porém como output terão os diferentes tipos de interface:
        // |circleScrew| -----> (circleScrew «»«»«» starScrew) -----> |starScrew|
        // ▪ |circleScrew| representa a interface com forma circular
        // ▪ |startScrew| representa a interface com forma em estrela
        // ▪ (circleScrew «»«»«» starScrew) representa o adaptador colocado entre ambas as interfaces
        //   que permite fazer a conversão de um circleScrew num startScrew
        // No código exemplo usado, o processo é idêntico, porém a aparafusadora não por omissão
        // não tem uma chave circular, ela simplesmente não contém qualquer chave, por isso
        // apenas só sabe que tem aparafusar (screw) sem ter que saber o tipo de parafuso que lhe espera
        // Com este padrão, no futuro, se um novo tipo de parafuso fosse adicionado (philips, por exemplo)
        // apenas um novo adaptador teria que ser criado para que fosse possível fazer a conversão
        // de uma interface para a outra (não quebra o Open-Closed Principle)
        // Nota: É importante salientar que o processo de conversão que ocorre no adaptador não deve
        //       qualquer processo comportamental, uma vez que nesse caso estaria-se a derivar para o
        //       padrão Decorator. Apenas o processo de conversão de interfaces deve ser realizado

        // cria uma aparafusadora
        Screwdriver screwdriver = new Screwdriver(350, "Leroy Merlin");

        System.out.println("=== Slotted Screw Adapter ===\n");

        // cria um parafuso do tipo fenda
        SlottedScrew slottedScrew = new SlottedScrew("Maxmat");
        // cria um adaptador de parafuso de fenda
        SlottedScrewAdapter slottedScrewAdapter = new SlottedScrewAdapter();
        // define que o parafuso de fenda vai ser usado neste adaptador criado
        slottedScrewAdapter.setSlottedScrew(slottedScrew);
        // coloca o adaptador de parafusos de fenda na aparafusadora
        screwdriver.changeScrewAdapter(slottedScrewAdapter);
        // informação atual da aparafusadora
        System.out.println(screwdriver.toString());
        // processo de aparafusamento
        int screwTime = screwdriver.screw();
        System.out.println(slottedScrew + " took " + screwTime + " seconds to screw.");

        System.out.println("\n=== Star Screw Adapter ===\n");

        // cria um parafuso do tipo estrela
        StarScrew starScrew = new StarScrew(7, 2);
        // cria um adaptador de parafuso em estrela
        StarScrewAdapter starScrewAdapter = new StarScrewAdapter();
        // define que o parafuso em estrela vai ser usado neste adaptador criado
        starScrewAdapter.setStarScrewAdapter(starScrew);
        // coloca o adaptador de parafusos em estrela na aparafusadora
        screwdriver.changeScrewAdapter(starScrewAdapter);
        // informação atual da aparafusadora
        System.out.println(screwdriver.toString());
        // processo de aparafusamento
        screwTime = screwdriver.screw();
        System.out.println(starScrew + " took " + screwTime + " seconds to screw.");

    }
}
