
package ejercicioc;

import java.util.Scanner;

public class EjercicioC {

  
    public static void main(String[] args) {
        /*c)Un comerciante realiza 5 ventas por día. Necesita de un programa
        que le permita ingresar por teclado los montos de las 5 ventas y luego sumar el 
        total de todas ellas para mostrar por pantalla el resultado. ¿Podrías ayudarlo a 
        realizar el programa? */
        
        //Primer venta
        System.out.println("Ingrese su primer venta: ");
        Scanner tecladoVenta1 = new Scanner(System.in);
        float venta1 = tecladoVenta1.nextFloat();
        
        //Segunda venta
        System.out.println("Ingrese su segunda venta: ");
        Scanner tecladoVenta2 = new Scanner(System.in);
        float venta2 = tecladoVenta2.nextFloat();
        
        //Tercer venta
        System.out.println("Ingrese su tercer venta: ");
        Scanner tecladoVenta3 = new Scanner(System.in);
        float venta3 = tecladoVenta3.nextFloat();
        
        //Cuarta venta
        System.out.println("Ingrese su cuarta venta: ");
        Scanner tecladoVenta4 = new Scanner(System.in);
        float venta4 = tecladoVenta4.nextFloat();
        
        //Quinta venta
        System.out.println("Ingrese su quinta venta: ");
        Scanner tecladoVenta5 = new Scanner(System.in);
        float venta5 = tecladoVenta5.nextFloat();
        
        float ventaTotal = venta1 + venta2 + venta3 + venta4 + venta5;
        
        System.out.println("Su monto total del dia es: " + ventaTotal+"$" );
    }
    
}
