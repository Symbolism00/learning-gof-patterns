package facade.complexSubSystem;

import java.util.List;

// classe do subsistema complexo que realiza diversas operações e apresenta
// referências a outras classes desse subsistema
public class SubSystemClass1 {

    private SubSystemClass2 subSystemClass2;
    private SubSystemClass5 subSystemClass5;
    private SubSystemClass6 subSystemClass6;

    // esta classe é composta por outras classes
    // - subSystemClass2
    // - subSystemClass5
    // - subSystemClass6
    public SubSystemClass1(SubSystemClass2 subSystemClass2, SubSystemClass5 subSystemClass5, SubSystemClass6 subSystemClass6){
        this.subSystemClass2 = subSystemClass2;
        this.subSystemClass5 = subSystemClass5;
        this.subSystemClass6 = subSystemClass6;
    }

    // métodos que esta classe executa

    public void doSomething(){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do some operations
    }

    public void doSomething2(SubSystemClass4 subSystemClass4){
        System.out.println("Executing method 2 of " + this.getClass().getSimpleName());
        // do some operations
    }

    public void doSomething3(String str, SubSystemClass4 subSystemClass4){
        System.out.println("Executing method 3 of " + this.getClass().getSimpleName());
        // do some operations
    }

    public void doSomething4(List<Long> longList, int intVal, String str){
        System.out.println("Executing method 4 of " + this.getClass().getSimpleName());
        // do some operations
    }

}
