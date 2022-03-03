package bridge;

import java.util.HashMap;
import java.util.Map;

// classe que representa um sistema externo (repositório de emails) onde os emails
// das empresas são guardados
public class EmailStaticRepository {

    public static Map<Integer, String> emails = new HashMap<Integer, String>(){
        {
            put(45, "company@comp.com");
            put(91, "test@comp.com");
            put(17, "business@comp.com");
        }
    };

}
