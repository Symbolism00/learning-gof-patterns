package adapter;

// classe que representa o parafuso em fenda
public class SlottedScrew {

    // tempo médio de aparafusamento deste tipo de parafuso
    private static final int SCREW_TIME = 3000;

    // para um parafuso em fenda apenas a propriedade marca existe
    private String brand;

    public SlottedScrew(String brand){
        this.brand = brand;
    }

    // interface do parafuso em fenda (slottedScrew)
    // assume-se que este tipo de parafuso devido ao facto de ser em fenda
    // por média demora 3 segundos a ser totalmente aparafusado à tábua
    public int slottedScrew(){
        System.out.println("Entering in a board");
        try {
            Thread.sleep(SCREW_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Screw Finished");
        return SCREW_TIME;
    }

    // descrição do parafuso em fenda
    @Override
    public String toString(){
        return "Slotted screw of brand " + brand;
    }
}
