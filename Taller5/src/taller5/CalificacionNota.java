package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class CalificacionNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion;
        System.out.println("Ingrese la calificación");
        calificacion = sc.nextInt();

        if (calificacion > 90) {
            System.out.println("La calificación A");
        } else if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("La calificación B ");
        } else {
            if (calificacion >= 70 && calificacion <= 79) {
                System.out.println("La calificación C");
            } else if (calificacion >= 60 && calificacion <= 69) {
                System.out.println("La calificación D");
            } else {
                System.out.println("La calificación E");
            }
        }
    }
}
