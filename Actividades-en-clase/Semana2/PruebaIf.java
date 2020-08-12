
package pruebaif;


public class PruebaIf {

    public static void main(String[] args) {
        
        //prueba de la estructura if con dos bloques
        int suma = 0;
        int num = 5;
        int resta = 0;
        String bloqueIf = "Ninguno";
        
        //pregunto si el num es mayor a 3
        
        if (num > 3){

            System.out.println("El numero es mayor a 3" );
        }
        
        else{
            
            if(num == 1){
                System.out.println("El numero ingresado es 1");
            }
            else{
                System.out.println("El numero es menor a 3 pero no es 1");
            }
        }
        //demostracion de que bloque IF fue utilizado
        System.out.println("El bloque al que entre es el: " + bloqueIf);
    }
    
}
