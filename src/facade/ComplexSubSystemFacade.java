package facade;

import facade.complexSubSystem.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

// classe que representa uma fachada e esconde toda a complexidade existente
// para a realização de operações numa única interface de simples acesso
// que são os métodos da fachada
// - executeOperation1()
// - executeOperation2()
// - executeOperation3()
// - executeOperationX()
// Nota: Esta classe apenas foi desenvolvida com o objetivo de demonstrar
//       como um subsistema pode ser complexo pelo que algumas boas práticas
//       possam ter sido violadas
public class ComplexSubSystemFacade {

    // método 1 de fachada que executa diferentes operações e associações complexas
    public void executeOperation1(String str){
        SubSystemClass5 subSystemClass5 = new SubSystemClass5();
        SubSystemClass6 subSystemClass6 = new SubSystemClass6();
        SubSystemClass1 subSystemClass1 = new SubSystemClass1(
                new SubSystemClass2(
                        new SubSystemClass3(subSystemClass6),
                        subSystemClass5),
                subSystemClass5,
                subSystemClass6);
        subSystemClass1.doSomething();
        executeOperation7();
        SubSystemClass4 subSystemClass4 = new SubSystemClass4();
        subSystemClass1.doSomething2(subSystemClass4);
        subSystemClass1.doSomething3(str, subSystemClass4);
        subSystemClass5.doSomething2(str);
        subSystemClass5.doSomething(2.5f);
        subSystemClass6.doSomething6();
        executeOperation5(75);
    }

    // método 2 de fachada que executa diferentes operações e associações complexas
    public void executeOperation2(double doubleValue, char charValue, String str){
        SubSystemClass3 subSystemClass3 = new SubSystemClass3(new SubSystemClass6());
        SubSystemClass2 subSystemClass2 = new SubSystemClass2(subSystemClass3, new SubSystemClass5());
        subSystemClass3.doSomething3(doubleValue, charValue, str);
        subSystemClass2.doSomething2(10);
        SubSystemClass4 subSystemClass4 = new SubSystemClass4();
        subSystemClass2.setSubSystemClass4(subSystemClass4);
        subSystemClass4.setSubSystemClass2(subSystemClass2);
        subSystemClass4.doSomething();
        subSystemClass3.doSomething6();
        subSystemClass3.doSomething7();
        subSystemClass3.doSomething4();
    }

    // método 3 de fachada que executa diferentes operações e associações complexas
    public void executeOperation3(int intValue1, int intValue2){
        SubSystemClass6 subSystemClass6 = new SubSystemClass6();
        subSystemClass6.doSomething2(intValue1, intValue2);
        subSystemClass6.doSomething();
        subSystemClass6.doSomething8(new ArrayList<>(), new LinkedList<>(), intValue1);
        SubSystemClass5 subSystemClass5 = new SubSystemClass5();
        subSystemClass5.doSomething(4.5f);
        executeOperation4();
    }

    // método 4 de fachada que executa diferentes operações e associações complexas
    public void executeOperation4(){
        SubSystemClass4 subSystemClass4 = new SubSystemClass4();
        subSystemClass4.doSomething();
        SubSystemClass3 subSystemClass3 = new SubSystemClass3(new SubSystemClass6());
        subSystemClass3.doSomething4();
        subSystemClass3.doSomething7();
    }

    // método 5 de fachada que executa diferentes operações e associações complexas
    public void executeOperation5(int intValue){
        executeOperation4();
        SubSystemClass4 subSystemClass4 = new SubSystemClass4();
        SubSystemClass2 subSystemClass2 = new SubSystemClass2(new SubSystemClass3(new SubSystemClass6()), new SubSystemClass5());
        subSystemClass2.doSomething2(intValue);
        subSystemClass2.setSubSystemClass4(subSystemClass4);
        subSystemClass4.setSubSystemClass2(subSystemClass2);
        subSystemClass4.doSomething();
        subSystemClass2.doSomething();
    }

    // método 6 de fachada que executa diferentes operações e associações complexas
    public void executeOperation6(Set<Character> charList, double doubleValue, int intValue){
        SubSystemClass1 subSystemClass1 = new SubSystemClass1(
                new SubSystemClass2(
                        new SubSystemClass3(new SubSystemClass6()),
                        new SubSystemClass5()),
                new SubSystemClass5(),
                new SubSystemClass6());
        subSystemClass1.doSomething2(new SubSystemClass4());
        subSystemClass1.doSomething();
        SubSystemClass3 subSystemClass3 = new SubSystemClass3(new SubSystemClass6());
        subSystemClass3.doSomething5(charList);
        executeOperation5(intValue);
        subSystemClass3.doSomething3(doubleValue, 'a', null);
    }

    // método 7 de fachada que executa diferentes operações e associações complexas
    public void executeOperation7(){
        SubSystemClass5 subSystemClass5 = new SubSystemClass5();
        subSystemClass5.doSomething2("str");
        SubSystemClass4 subSystemClass4 = new SubSystemClass4();
        subSystemClass4.doSomething();
    }
}
