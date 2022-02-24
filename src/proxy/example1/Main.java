package proxy.example1;

public class Main {

    public static void main(String[] args) {

        // SECURITY PROXY

        // Para este padrão assume-se que um processo pode ser acedido em diferentes
        // áreas do sistema, a primeira área permite que todos os dados de um processo
        // sejam visualizáveis, enquanto que a segunda área não permite a visualização
        // de dados confidenciais.
        // Para a visualização apenas dos dados não confidenciais, o padrão Proxy permite
        // definir uma classe intermédia com quem o código cliente irá interagir.
        // Esta classe terá a única responsabilidade de realizar processos se segurança
        // Esta segurança apresenta duas dimensões.
        // 1. Quando na interface ProxyProcess se definem os métodos a implementar, já se
        //    está a criar uma zona de segurança em que os métodos de acesso a dados
        //    confidenciais são escondidos.
        // 2. No SecurityProxyProcess quando na implementação do método de acesso ao tema
        //    cria-se uma condição que verifica se o utilizador tem um determinado papel
        // Em ambas as dimensões cria-se um "escudo" sobre os diferentes métodos de acesso
        // porém o primeiro bloqueia totalmente qualquer acesso, enquanto que o segundo
        // bloqueia parcialmente

        // zona do sistema em que é possível aceder a todos os dados do processo
        allowedPermissions();

        // zona do sistema em que só é possível aceder a dados não confidenciais do processo
        notAllowedPermission();

    }

    public static void allowedPermissions(){
        // obtém o processo da base de dados estática
        Process process = StaticMemoryDatabase.processes.get(0);

        // nenhum proxy é criado e por isso todos os utilizadores
        // têm acesso aos dados do processo (quer sejam confidenciais ou não)
        System.out.println(process.getNumber());
        System.out.println(process.getRegistryDate());
        System.out.println(process.getTheme());
        System.out.println(process.getRecipient());
        System.out.println(process.getSubject());
    }

    public static void notAllowedPermission(){
        // cria um proxy do processo em que o utilizador tem o papel ROLE_B
        SecurityProxyProcess processProxy = new SecurityProxyProcess(0, "ROLE_B");
        // como está a comunicar com o proxy, apenas consegue aceder a estes
        // três métodos que retornam dados não confidenciais
        System.out.println(processProxy.getNumber());
        System.out.println(processProxy.getRegistryDate());
        System.out.println(processProxy.getTheme());

        // cria um proxy do processo em que o utilizador tem o papel ROLE_C
        processProxy = new SecurityProxyProcess(1, "ROLE_C");
        // como está a comunicar com o proxy, apenas consegue aceder a estes
        // três métodos que retornam dados não confidenciais
        System.out.println(processProxy.getNumber());
        System.out.println(processProxy.getRegistryDate());
        // neste método será retornado null, uma vez que o utilizador não
        // tem o papel ROLE_B e vai falhar na condição
        System.out.println(processProxy.getTheme());
    }
}
