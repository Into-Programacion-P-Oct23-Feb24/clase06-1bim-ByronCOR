/*

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese su universidad");
        String univ = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        nombre = nombre.toLowerCase();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                nombre = nombre.toUpperCase();
                apellido = apellido.toUpperCase();
                System.out.printf("%s %s con edad de %d ,es estudiante "
                        + "de %s ",nombre.toUpperCase(), 
                        apellido.toUpperCase(), edad, univ);
                break;

            default:
                nombre = nombre.toLowerCase();
                apellido = apellido.toLowerCase();
                System.out.printf("%s %s con edad de %d ,es estudiante"
                        + " de %s ",nombre.toLowerCase(), 
                        apellido.toLowerCase(), edad, univ);
                break;

        }

    }
}
