package observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // assume-se que existe um objecto que de X em X segundos atualiza o seu estado
        // e que outros objectos de diferentes tipos querem ser notificados quando
        // esse objecto é alterado. Cada objecto que quer ser notificado executa uma operação
        // após esse objeto ter sido alterado. Estas alterações podem ser diferentes entre os objetos

        // uma pessoa que vive sozinha tem momentos do dia que sai e entra em casa
        // ela tem uma casa inteligente que faz alterações automáticas à temperatura, luz e janelas
        // quando a pessoa sai ou entra em casa. O controlo das entradas e saídas de uma pessoa
        // é realizado através de um sensor existente no hall de entrada

        // sensor pai (por default a pessoa começa fora de casa)
        EntraceHallSensor entranceHall = new EntraceHallSensor();
        // sensores filhos que vão estar à escuta do sensor pai
        // eles precisam de ter acesso ao sensor pai com o objetivo de saber se tem alguém ou não
        // em casa. Este podia ser passado pelo método notifyObservers() porém nem sempre todos
        // os observadores atualizam o seu estado através do valor que seria enviado por esse método
        // (neste caso seria igual para todos -> isAnyoneAtHome). Por isso injeta-se o observado nos
        // observadores para depois cada um atualizar consoante as suas preferências
        Observer temperature = new TemperatureSensor(entranceHall);
        Observer window = new WindowSensor(entranceHall);
        Observer light = new LightSensor(entranceHall);

        // adicionados os três sensores que vão estar a observar e vão querer receber notificações
        // de quando a pessoa sai ou entra dentro de casa
        entranceHall.addObserver(temperature);
        entranceHall.addObserver(window);
        entranceHall.addObserver(light);

        // assume-se que a pessoa sai e entra de casa umas 10x de 5 em 5 sec
        for(int i = 0; i < 10; i++){
            // entrou/saiu de casa
            entranceHall.toggleAnyoneAtHome();
            // notifica os observadores
            entranceHall.notifyObservers();

            // verifica-se os estados de cada um
            System.out.println(temperature.currentState());
            System.out.println(window.currentState());
            System.out.println(light.currentState() + "\n");

            Thread.sleep(5000);

            // na oitava entrada/saída não se quer que as janelas sejam observadoras
            if(i == 7){
                entranceHall.removeObserver(window);
            }
        }
    }
}
