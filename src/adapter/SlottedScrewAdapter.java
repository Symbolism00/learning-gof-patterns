package adapter;

// classe que representa o adaptador em fenda. Este adaptador sabe que tem que
// aparafusar um parafuso em fenda e por isso referencia-o por composição
public class SlottedScrewAdapter implements ScrewAdapter {

    // tipo de parafuso que o adaptador vai aparafusar (neste caso é
    // um parafuso de fenda)
    private SlottedScrew slottedScrew;

    // processo que o adaptador tem que fazer, este sabe que tem
    // que aparafusar, mas como? Uma vez que este adaptador sabe
    // que tem que aparafusar um parafuso em fenda, apenas chama
    // o método slottedScrew deste tipo de parafuso
    @Override
    public int screw() {
        return this.slottedScrew.slottedScrew();
    }

    // define o tipo de parafuso para este adaptador
    // parafusos do tipo estrela não fariam sentido neste adaptador
    public void setSlottedScrew(SlottedScrew slottedScrew){
        this.slottedScrew = slottedScrew;
    }

    // descrição do adaptador
    @Override
    public String toString(){
        return "Slotted Screw Adapter";
    }
}
