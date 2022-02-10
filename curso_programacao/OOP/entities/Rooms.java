package OOP.entities;

public class Rooms {
    // Atributos
    private String name;
    private String email;

    // Contrutores
    public Rooms(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + ", " + email;
    }
}
