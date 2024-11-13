import Animales.*;

public class Main {
    public static void main(String[] args) {
        Perro husky = new Perro("Husky");
        System.out.println("Nombre del animal: " + husky.getNombre());
        husky.expresarse();
        husky.alimentarse("hogareño");
        System.out.println(husky.recorridoEnMetrosPorSegundo());
        husky.amamantar();

        // Falta hacer lo mismo con el gato
    }
}
