/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades,
se hace un descuento de 15%.
 */
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class PrecioArticulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la descripción de su producto: ");
        String descripcion = sc.nextLine();

        System.out.println("Ingrese el precio unitario de su producto: ");
        double precioUnitario = sc.nextDouble();

        System.out.println("Ingrese la cantidad de productos que va a adquirir");
        int cantidadProductos = sc.nextInt();

        double costoArticulo = precioUnitario * cantidadProductos;

        if (cantidadProductos > 50) {
            costoArticulo -= costoArticulo * 0.15;
        }

        System.out.println("----------------------------------------");
        System.out.println("Pedido de: " + descripcion);
        System.out.println("El precio de su pedido es de: $" + costoArticulo);
        System.out.println("----------------------------------------");
    }
}
