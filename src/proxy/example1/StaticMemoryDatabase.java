package proxy.example1;

import java.util.*;

public class StaticMemoryDatabase {

    // base de dados estática em memória que contém três processos
    // alguns deles poderão ser acedidos, sendo que alguns dados são confidenciais
    // enquanto que outros não
    static List<Process> processes = new ArrayList<Process>(){
        {
            add(new Process(100L, new Date(), "Robbery", "John", "Robbed a bank"));
            add(new Process(101L, new Date(), "Fraud", "Mike", "Tax fraud"));
            add(new Process(102L, new Date(), "Money Laundering", "Anna", "Bank money laundering"));
        }
    };
}
