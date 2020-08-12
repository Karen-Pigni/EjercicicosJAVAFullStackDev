
package ejerciciob;

import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {
        /*b)Una estudiante está dando sus primeros pasos en la programación 
            y quiere realizar un programa que permita calcular cualquier porcentaje de un número. 
            Para ello necesita que el usuario ingrese por teclado el número a calcular el porcentaje 
            (por ejemplo 2500) y también el porcentaje que se desea calcular 
            (por ejemplo si quiere calcular 10% debería ingresar 0,10). A partir de estos valores, necesita que el algoritmo calcule el porcentaje (multiplicar el primer número por el valor del porcentaje), 
            lo guarde en una variable y se muestre por pantalla. 
            ¿Podrías ayudarla a realizar el programa? */
             System.out.println("Ingrese su numero a calcular: ");
             Scanner tecladoCalcular = new Scanner(System.in);
             int numero1 = tecladoCalcular.nextInt();
             
             System.out.println("Ingrese el porcentaje a sacar para su numero: (Ejemplo: 10% = 0,10)");
             Scanner tecladoPorcentaje = new Scanner(System.in);
             double numero2 = tecladoPorcentaje.nextDouble();  

                
             int  result = (int) (numero1 * numero2); 
             System.out.println("El porcentaje de se numero a calcular es: " + result);
             
             
    }
    
}
