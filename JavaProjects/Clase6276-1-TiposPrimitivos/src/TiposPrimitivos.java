import java.sql.SQLOutput;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipo booleano
        boolean b;
        b = !((3-2) != 1) || false;
        System.out.println("Tipo: boolean");
        System.out.println("Valor booleano: " + b);

        // Tipo caracter
        char letra = '\u03C0';
        System.out.println("\n" + letra);
        System.out.println("Tipo: char");
        System.out.println("Tamaño en bits: " + Character.SIZE);
        System.out.println("Tamaño en bytes: " + Character.BYTES);

        // Tipo cadena de caracteres
        String nombre = "Diego";
        String palabra = new String("EAFIT");
        System.out.println("\n" + palabra);
        System.out.println("Tipo: String");

        //Tipos primitivos enteros
        // byte
        byte num1 = 127;
        System.out.println("\n" + num1);
        System.out.println("Tipo: Byte");
        System.out.println("Tamaño en bits: " + Byte.SIZE);
        System.out.println("Tamaño en bytes: " + Byte.BYTES);
        System.out.println("Valor mínimo: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo: " + Byte.MAX_VALUE);

        // short
        short num2 = 32767;
        System.out.println("\n" + num2);
        System.out.println("Tipo: Short");
        System.out.println("Tamaño en bits: " + Short.SIZE);
        System.out.println("Tamaño en bytes: " + Short.BYTES);
        System.out.println("Valor mínimo: " + Short.MIN_VALUE);
        System.out.println("Valor máximo: " + Short.MAX_VALUE);

        // int
        int num3 = 2147483647;
        System.out.println("\n" + num3);
        System.out.println("Tipo: Integer");
        System.out.println("Tamaño en bits: " + Integer.SIZE);
        System.out.println("Tamaño en bytes: " + Integer.BYTES);
        System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo: " + Integer.MAX_VALUE);

        // long
        long num4 = 9223372036854775807l;
        System.out.println("\n" + num4);
        System.out.println("Tipo: Long");
        System.out.println("Tamaño en bits: " + Long.SIZE);
        System.out.println("Tamaño en bytes: " + Long.BYTES);
        System.out.println("Valor mínimo: " + Long.MIN_VALUE);
        System.out.println("Valor máximo: " + Long.MAX_VALUE);

        float num5 = -3.4028235E38f;
        System.out.println("\n" + num5);
        System.out.println("Tipo: Float");
        System.out.println("Tamaño en bits: " + Float.SIZE);
        System.out.println("Tamaño en bytes: " + Float.BYTES);
        System.out.println("Valor mínimo: " + Float.MIN_VALUE);
        System.out.println("Valor máximo: " + Float.MAX_VALUE);

        double num6 = 3.4028236E38;
        System.out.println("\n" + num6);
        System.out.println("Tipo: Double");
        System.out.println("Tamaño en bits: " + Double.SIZE);
        System.out.println("Tamaño en bytes: " + Double.BYTES);
        System.out.println("Valor mínimo: " + Double.MIN_VALUE);
        System.out.println("Valor máximo: " + Double.MAX_VALUE);

        // Tipo genérico
        var a = 9;
        var c = 5.5;
        var res = a + c;
        System.out.println("\nVariables tipo var: " + a + ", " + c);
        System.out.println(a + " + " + c + " = " + res);

    }
}
