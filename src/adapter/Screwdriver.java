package adapter;

// classe que representa a aparafusadora
public class Screwdriver {

    // uma aparafusadora apresenta um custo e uma marca
    private double cost;
    private String brand;
    // adaptador que pode ser trocado quando o utilizador sentir necessidade
    private ScrewAdapter screwAdapter;

    public Screwdriver(double cost, String brand){
        this.cost = cost;
        this.brand = brand;
    }

    // processo de aparafusar, a aparafusadora apenas sabe que tem que aparafusar.
    // Como aparafusar ou qual a interface do parafuso que lhe espera?
    // O adaptador é que tem esse conhecimento, por exemplo, se for um adaptador de
    // parafuso em estrela, ele sabe que a interface do parafuso que lhe espera
    // é em estrela
    public int screw(){
        return this.screwAdapter.screw();
    }

    // permite a troca de adaptadores (estrela para fenda, fenda para estrela, etc)
    public void changeScrewAdapter(ScrewAdapter screwAdapter){
        this.screwAdapter = screwAdapter;
    }

    // descrição da aparafusadora
    @Override
    public String toString(){
        return "Screwdriver of brand " + brand + " that cost " + cost
                + " € and now has the adapter " + screwAdapter.toString();
    }
}
