public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona('m');
        System.out.println(juan.getNombre());

        juan.setNombre("Juan");
        juan.setFechaNacimiento(4,5,1990);

        System.out.println("NOmbre de usuario: " + juan.getNombre());
        System.out.println("Fecha de nacimiento: " + juan.getFechaNacimiento());
    }
}
