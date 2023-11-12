
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class CategoriaEdad {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres un adulto");
        }else if(edad >= 12){
            System.out.println("Eres un adolescente");
        }else{
            System.out.println("Eres un nino");
        }
    }
}
