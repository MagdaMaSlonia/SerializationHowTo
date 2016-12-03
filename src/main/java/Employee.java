import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String surname;
    static final private int ID = 123456;

    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return ID;
    }
}
