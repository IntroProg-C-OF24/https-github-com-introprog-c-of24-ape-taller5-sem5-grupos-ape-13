/*
Elaborar una solución que permita leer los datos de un automóvil 
(marca, origen y costo) imprima el impuesto por pagar 
y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, 
si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class PrecioAutomovil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el país de origen del vehículo");
        System.out.println("Países disponibles: Alemania, Japon, Italia, USA");
        String paisOrigen = sc.nextLine();

        System.out.println("Ingrese la marca del vehículo: ");
        String marcaVehiculo = sc.nextLine();

        System.out.println("Ingrese el costo del vehículo: ");
        double costoVehiculo = sc.nextDouble();

        double porcentajeImpuesto;

        //Transformar el nombre a minúsculas para comparar los casos correctamente
        switch (paisOrigen.toLowerCase()) {
            case "alemania" ->
                porcentajeImpuesto = 0.20;
            case "japon" ->
                porcentajeImpuesto = 0.30;
            case "italia" ->
                porcentajeImpuesto = 0.15;
            case "usa" ->
                porcentajeImpuesto = 0.08;
            default ->
                porcentajeImpuesto = 0.00; //En caso de que el pais de origen sea otro, no cobrar impuesto
        }

        double precioImpuesto = costoVehiculo * porcentajeImpuesto;

        System.out.println("El impuesto a pagar por tu vehículo es de: " + precioImpuesto);
        System.out.println("El coste final de tu carro es de: $" + (costoVehiculo + precioImpuesto));
    }
}
