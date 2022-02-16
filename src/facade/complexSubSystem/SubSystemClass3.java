package facade.complexSubSystem;

import java.util.Set;

// classe do subsistema complexo que realiza diversas operações e apresenta
// referências a outras classes desse subsistema
public class SubSystemClass3 {

    private SubSystemClass6 subSystemClass6;

    // esta classe é composta por outras classes
    // - subSystemClass6
    public SubSystemClass3(SubSystemClass6 subSystemClass6){
        this.subSystemClass6 = subSystemClass6;
    }

    // métodos que esta classe executa

    public void doSomething(){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething2(String str1, String str2, String str3){
        System.out.println("Executing method 2 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething3(double doubleValue, char charValue, String str){
        System.out.println("Executing method 3 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething4(){
        System.out.println("Executing method 4 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething5(Set<Character> charList){
        System.out.println("Executing method 5 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething6(){
        System.out.println("Executing method 6 of " + this.getClass().getSimpleName());
        // do something;
    }

    public void doSomething7(){
        System.out.println("Executing method 7 of " + this.getClass().getSimpleName());
        // do something;
    }

}
