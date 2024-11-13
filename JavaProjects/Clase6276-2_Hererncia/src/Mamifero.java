public class Mamifero {
    private String nombre;
    // Constructor
    public Mamifero(String nombre) {
        this.nombre = nombre;
    }
    public Mamifero(){
        this.nombre = "Por definir";
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
