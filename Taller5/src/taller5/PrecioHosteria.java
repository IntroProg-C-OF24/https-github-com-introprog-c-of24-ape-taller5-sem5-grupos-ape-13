/*
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días,
del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación 
y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class PrecioHosteria {

    public static void main(String[] args) {
        double descuento;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de días que se hospedó ");
        int numeroDias = sc.nextInt();

        System.out.println("Ingrese el precio diario de la habitación: ");
        double precioDiario = sc.nextDouble();

        double subtotal = numeroDias * precioDiario;

        if (numeroDias > 15) {
            descuento = 0.20;
        } else if (numeroDias > 10) {
            descuento = 0.15;
        } else if (numeroDias > 5) {
            descuento = 0.10;
        } else {
            descuento = 0.0;
        }
        
        double cantidadDescuento = subtotal * descuento;

   
        System.out.println("El subtotal de su factura es: $" + subtotal);
        System.out.println("Su descuento obtenido es de: $" + cantidadDescuento);
        System.out.println("El total a pagar es de: $" + (subtotal - cantidadDescuento));
    }
}
