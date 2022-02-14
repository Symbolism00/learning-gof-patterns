package adapter;

// classe que representa o adaptador em estela. Este adaptador sabe que tem que
// aparafusar um parafuso em estrela e por isso referencia-o por composição
public class StarScrewAdapter implements ScrewAdapter {

    // tipo de parafuso que o adaptador vai aparafusar (neste caso é
    // um parafuso em estrela)
    private StarScrew starScrew;

    // processo que o adaptador tem que fazer, este sabe que tem
    // que aparafusar, mas como? Uma vez que este adaptador sabe
    // que tem que aparafusar um parafuso em estrela, apenas chama
    // o método starScrew deste tipo de parafuso
    @Override
    public int screw() {
        return this.starScrew.starScrew();
    }

    // define o tipo de parafuso para este adaptador
    // parafusos do tipo fenda não fariam sentido neste adaptador
    public void setStarScrewAdapter(StarScrew starScrew){
        this.starScrew = starScrew;
    }

    // descrição do adaptador
    @Override
    public String toString(){
        return "Star Screw Adapter";
    }
}
