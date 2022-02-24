package proxy.example1;

import java.util.Date;

// proxy de segurança que o código cliente vai comunicar de modo a só ter acesso
// somente dados não confidenciais
public class SecurityProxyProcess implements ProxyProcess{

    // o proxy de um processo tem o processo associado, uma vez que
    // vai chamar os métodos do mesmo
    private Process process;
    // papel usado na condição para verificar se o utilizador tem acesso ao tema
    private String role;

    // para criar um proxy do processo é necessário passar um índice para obter o
    // processo de uma base de dados estátia em memória e o papel do utilizador
    public SecurityProxyProcess(int index, String role){
        // obtém o processo da base de dados em memória
        this.process = StaticMemoryDatabase.processes.get(index);
        this.role = role;
    }

    // método que permite obter o número do processo
    @Override
    public Long getNumber() {
        return process.getNumber();
    }

    // método que permite obter a data de registo do processo
    @Override
    public Date getRegistryDate() {
        return process.getRegistryDate();
    }

    // método que permite obter o tema do processo
    @Override
    public String getTheme() {
        // para ter acesso a este dado não confidencial é necessário que o
        // utilizador tenha como papel ROLE_B
        if(role.equals("ROLE_B")){
            return process.getTheme();
        }
        // se não tiver então null é-lhe retornado
        return null;
    }
}
