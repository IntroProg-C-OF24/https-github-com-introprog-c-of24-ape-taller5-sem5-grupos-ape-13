
/*
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
*/
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class PlantillaLuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa costo de kilovatio/hora");
        double costoKilovatioHora = sc.nextDouble();
        
        System.out.println("Ingresa el número de kilovatios consumidos en el mes");
        double kilovatiosConsumidos = sc.nextDouble();
        
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        
        double plantillaLuz = costoKilovatioHora * kilovatiosConsumidos;
        
        if(edad > 65){
            plantillaLuz -= plantillaLuz * 0.10;
        }
        
        System.out.println("El coste de tu plantilla es: " + plantillaLuz);
        
    }
}
