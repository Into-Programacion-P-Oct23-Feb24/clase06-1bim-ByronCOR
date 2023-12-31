/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();

        switch (cadena) {
            case "Lunes":
            case "LUNES":
            case "lunes":
                System.out.printf("%s\n", cadena);
                break;

            case "Martes":
            case "martes":
            case "MARTES":
                System.out.printf("%s\n", cadena);
                break;

            case "Miércoles":
            case "MIÉRCOLES":
            case "miércoles":
                System.out.printf("%s\n", cadena);
                break;

            case "Jueves":
            case "JUEVES":
            case "jueves":
                System.out.printf("%s\n", cadena);
                break;

            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s\n", cadena);
                break;

            case "SÁBADO":
            case "Sábado":
            case "sábado":
                System.out.printf("%s\n", cadena);
                break;

            case "domingo":
            case "DOMINGO":
            case "Domingo":
                System.out.printf("%s\n", cadena);
                break;

            default:
                System.out.println("ninguna de las anteriores");
                break;
        }

    }
}
