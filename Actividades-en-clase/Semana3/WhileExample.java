
package whileexample;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
//EJERCICIO CON CONTADOR
       int contador = 0;
       while (contador <=10){
          System.out.println("Estoy en la vuelta N" + contador);
           contador ++;
        }


//EJERCICIO CON CENTINELA
       boolean bandera = true;
        while(bandera == true){
            System.out.println("El valor de mi bandera es:" + bandera);
            //Vamos a ingresar n por teclado
            System.out.println("Ingrese un numero por consola:");
            
            Scanner teclado = new Scanner(System.in);//creo my scanneador
            
            int tecla = teclado.nextInt();//guardo el numero ingresado por teclado
            
            if(tecla == 1){
                bandera = false;//cambio de valor a bandera y salid a del while
                System.out.println("Saliendo del programa");
            }
        }
    //UTILIZIAR equals(Xstr) PARA COMPARAR DOS STR 
    }
    
}
