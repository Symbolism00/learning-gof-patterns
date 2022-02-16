package facade.complexSubSystem;

// classe do subsistema complexo que realiza diversas operações e apresenta
// referências a outras classes desse subsistema
public class SubSystemClass2 {

    private SubSystemClass3 subSystemClass3;
    private SubSystemClass5 subSystemClass5;
    private SubSystemClass4 subSystemClass4;

    // esta classe é composta por outras classes
    // - subSystemClass3
    // - subSystemClass5
    public SubSystemClass2(SubSystemClass3 subSystemClass3, SubSystemClass5 subSystemClass5) {
        this.subSystemClass3 = subSystemClass3;
        this.subSystemClass5 = subSystemClass5;
    }

    // métodos que esta classe executa

    public void doSomething(){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do some operations
    }

    public void doSomething2(int intValue){
        System.out.println("Executing method 2 of " + this.getClass().getSimpleName());
        // do some operations
    }

    // composição cruzada com o subSystemClass4
    public void setSubSystemClass4(SubSystemClass4 subSystemClass4){
        this.subSystemClass4 = subSystemClass4;
    }
}
