package adapter;

// classe que representa o parafuso em estrela
public class StarScrew {

    // para um parafuso em estrela as propriedades existentes são o tamanho
    // e o largura da cabeça do parafuso
    private double size;
    private double headWidth;

    public StarScrew(double size, double headWidth){
        this.size = size;
        this.headWidth = headWidth;
    }

    // interface do parafuso em estrela (starScrew)
    // assume-se que este tipo de parafuso devido ao facto de ser em estrela
    // permite que a operação de aparafusar seja instantânea
    public int starScrew(){
        System.out.println("Instantly entering in a board");
        return 0;
    }

    // descrição do parafuso em estrela
    @Override
    public String toString(){
        return "Star screw with size of " + size + " cm and head width of " + headWidth + " cm";
    }
}
