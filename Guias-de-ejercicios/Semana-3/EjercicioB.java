
package ejerciciob;

import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {
        System.out.println("Ingrese su numero:");
        Scanner tecladoNumero = new Scanner(System.in);
        int inicio = 1;
        int numero = tecladoNumero.nextInt();
        
        while(inicio <= numero){
            System.out.println("N: " + inicio);
            inicio++;
        }
    }
    
}
