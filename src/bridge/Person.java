package bridge;

// classe que representa uma entidade, neste caso uma pessoa que contém
// diversas informações sobre a mesma
public class Person {

    // primeiro nome
    private String firstName;
    // último nome
    private String lastName;
    // contacto pessoal
    private long phoneNumber;
    // email pessoal
    private String email;
    // idade
    private int age;

    public Person(String firstName, String lastName, long phoneNumber, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    // obtém o primeiro nome da pessoa
    public String getFirstName() {
        return firstName;
    }

    // obtém o último nome da pessoa
    public String getLastName() {
        return lastName;
    }

    // obtém o contacto pessoal da pessoa
    public long getPhoneNumber() {
        return phoneNumber;
    }

    // obtém o email da pessoa
    public String getEmail() {
        return email;
    }
}
