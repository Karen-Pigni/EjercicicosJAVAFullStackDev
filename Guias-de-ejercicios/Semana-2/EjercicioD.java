
package ejerciciod;

import java.util.Scanner;


public class EjercicioD {

    public static void main(String[] args) {
        /*d)	Realizar un programa que calcule el IVA de un producto. 
                Para esto, el usuario debe poder ingresar por teclado el valor 
                del producto y el programa debe informarle por pantalla 
                qué monto equivale al IVA. Recordar que el IVA es igual 
                al 21% (0,21).*/
        
                System.out.println("CALCULO DE IVA EN PRODUCTO");
                System.out.println("Ingrese el valor de su producto: ");
                
                Scanner product = new Scanner(System.in);
                float value = product.nextFloat();
                double iva = 0.21;
                
                double result = value + (value * iva);
                System.out.println("El valor de su producto mas IVa es: " + result + "$");
                
    }
    
}
