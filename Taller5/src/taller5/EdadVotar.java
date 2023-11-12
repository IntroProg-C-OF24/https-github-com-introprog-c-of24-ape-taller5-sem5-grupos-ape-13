package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class EdadVotar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        if (edad < 18) {
            System.out.println("No eres apto para votar");
        } else {
            System.out.println("Eres apto para votar");
        }
    }

}
