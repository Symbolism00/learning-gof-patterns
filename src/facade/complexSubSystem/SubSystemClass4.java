package facade.complexSubSystem;

// classe do subsistema complexo que realiza diversas operações e apresenta
// referências a outras classes desse subsistema
public class SubSystemClass4 {

    private SubSystemClass2 subSystemClass2;

    // composição cruzada com o subSystemClass2
    public void setSubSystemClass2(SubSystemClass2 subSystemClass2){
        this.subSystemClass2 = subSystemClass2;
    }

    // métodos que esta classe executa

    public void doSomething(){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do something
    }
}
