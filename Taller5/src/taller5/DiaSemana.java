
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class DiaSemana {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa el número de la semana");
        numero = teclado.nextInt();
        
        //Nueva sintaxis de switch-case: 
        switch (numero){
            case 1 -> System.out.println("Es lunes");
            case 2 -> System.out.println("Es martes");
            case 3 -> System.out.println("Es Miercoles");
            case 4 -> System.out.println("Es jueves");
            case 5 -> System.out.println("Es viernes");
            case 6 -> System.out.println("Es sábado");
            case 7 -> System.out.println("Es domingo");
            default -> System.out.println("El día no existe");
        }
    }   
}
