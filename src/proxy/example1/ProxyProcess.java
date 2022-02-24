package proxy.example1;

import java.util.Date;

// interface proxy que terá os métodos de acesso aos dados que não são
// confidenciais. Assim, quando o utilizador estiver a comunicar com
// o proxy, apenas poderá ter acesso a estes três métodos
public interface ProxyProcess {

    // método que obtém o número do processo
    Long getNumber();
    // método que obtém a data de registo do processo
    Date getRegistryDate();
    // método que obtém o tema do processo
    String getTheme();

}
