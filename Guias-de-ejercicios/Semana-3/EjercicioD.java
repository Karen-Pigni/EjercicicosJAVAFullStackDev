
package ejerciciod;

public class EjercicioD {

    public static void main(String[] args) {
        System.out.println("Cuenta regresiva ano nuevo");
           int counter = 10;
           
           while( counter <= 10  && counter >= 0){
               System.out.println("Faltan " + counter + " SEGUNDOS");
               counter--;
           }
    }
    
}
