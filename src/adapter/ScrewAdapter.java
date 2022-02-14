package adapter;

// interface que representa um adaptador que vai ser colocado entre a aparafusadora
// e o parafuso a ser aparafusado numa tábua. Esta interface permite que qualquer
// tipo de adaptador seja utilizado, por exemplo adaptador de parafusos em estrela,
// fenda, philips, robertson e spanner
public interface ScrewAdapter {

    // operação a ser executada por qualquer um dos adaptadores, eles apenas
    // aparafusam e não querem saber o que acontece no processo de aparafusamento.
    // O tempo de aparafusamento é retornado
    int screw();
}
