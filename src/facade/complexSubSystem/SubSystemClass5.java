package facade.complexSubSystem;

// classe do subsistema complexo que realiza diversas operações e que
// não é composta por outras classes do subsistema, apenas compões outras
public class SubSystemClass5 {

    // métodos que esta classe executa

    public void doSomething(float floatValue){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething2(String str){
        System.out.println("Executing method 2 of " + this.getClass().getSimpleName());
        // do something
    }
}
