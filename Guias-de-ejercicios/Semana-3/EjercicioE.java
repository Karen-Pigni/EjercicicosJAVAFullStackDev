
package ejercicioe;

import java.util.Scanner;

public class EjercicioE {
    
    public static void main(String[] args) {
        String palabra = "";
        
        while(!palabra.equals("salir")){
            System.out.println("INGRESE SU PALABRA || SI DESEA FINALIZAR INGRESE SALIR");
            Scanner tecladoEntrada = new Scanner(System.in);
            palabra = tecladoEntrada.next();
            System.out.println("Su palabra es: " + palabra);
        }
        if(palabra.equals("salir")){
            System.out.println("FINALIZANDO PROGRAMA...");
        }
    }
    
}
