
package taller5;

//Descontar 10% si el producto excede los 100 dólares :D
import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class DescuentoCompras {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        int precio = sc.nextInt();
        
        if(precio > 100){
            precio -= precio * 0.10;
        }
        
        System.out.println("El precio final del producto es: " + precio); 
    }
}
