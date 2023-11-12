
package taller5;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class MayorTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa 3 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max;
        
        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }
       
        if(max < num3){
            max = num3;
        }
        
        System.out.println("El número mayor es: " + max);
        
        
    }
}
