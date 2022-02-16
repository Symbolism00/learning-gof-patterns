package facade.complexSubSystem;

import java.util.List;
import java.util.Map;

// classe do subsistema complexo que realiza diversas operações e que
// não é composta por outras classes do subsistema, apenas compões outras
public class SubSystemClass6 {

    // métodos que esta classe executa

    public void doSomething(){
        System.out.println("Executing method 1 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething2(int intValue1, int intValue2){
        System.out.println("Executing method 2 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething3(String str, List<Double> doubleList){
        System.out.println("Executing method 3 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething4(double doubleValue, long longValue){
        System.out.println("Executing method 4 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething5(char charValue1, char charValue2){
        System.out.println("Executing method 5 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething6(){
        System.out.println("Executing method 6 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething7(Map<String, List<Double>> map){
        System.out.println("Executing method 7 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething8(List<String> strList1, List<String> strList2, int intValue){
        System.out.println("Executing method 8 of " + this.getClass().getSimpleName());
        // do something
    }

    public void doSomething9(){
        System.out.println("Executing method 9 of " + this.getClass().getSimpleName());
        // do something
    }
}
