package strategy;

// Classe que nos dá o contexto em que a estratégia vai ser utilizada
// Neste exemplo o contexto será no calculo de áreas, porém este contexto não necessita
// de saber que tipo de áreas vai calcular, apenas só quer calcular áreas
public class AreaContext {

    // referência para a estratégia a ser utilizada
    private AreaStrategy areaStrategy;

    // permite a troca de estratégias
    public void setAreaStrategy(AreaStrategy areaStrategy){
        this.areaStrategy = areaStrategy;
    }

    // apenas calcula a área perante a estratégia que encontra a ser usada de momento
    public double calculateArea(){
        return this.areaStrategy.execute();
    }
}
