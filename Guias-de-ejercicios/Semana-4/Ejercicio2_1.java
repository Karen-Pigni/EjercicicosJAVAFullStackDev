
package ejercicio1_3;

import java.util.Scanner;

public class Ejercicio1_3 {
    
    public static void main(String[] args) {
        /*
            Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
            de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
            a) Los repositores cobran $15.890 + un bono de 10%.
            b) Los cajeros cobran $25.630,89 fijos.
            c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%
            de jubilación.
            Se necesita un programa que, dependiendo el tipo de empleado del que se trate,
            calcule y muestre en pantalla el correspondiente sueldo.
        */ 
        
        //int empleados;
        double resultado;
        int tipo = 0;
        
        while(tipo != 4){
            
            Scanner teclado= new Scanner(System.in);
            System.out.println("Ingrese n° de categoría según puesto de trabajo (1- Repositor. 2- Cajero. 3- Supervisor. 4- Salir) ");
            tipo = teclado.nextInt();
            
            
            if(tipo == 1){
                resultado = 15890 +(15890*0.10);
                System.out.println("El sueldo a cobrar es de $"+resultado);
            }else if(tipo == 2){
                resultado = 25630;
                System.out.println("El sueldo a cobrar es de $"+resultado);
            }else if(tipo == 3){
                resultado = 35560.20-(35560.20*0.11);
                System.out.println("El sueldo a cobrar es de $"+resultado);
            }else{
                System.out.println("El valor ingresado no es correcto");
            }
        }
        
        System.out.println("Programa finalizado");
    }
    
}
