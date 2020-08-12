
package exercisewhile;

public class ExerciseWhile {

    public static void main(String[] args) {
        
        //EJERCICIO 1: contar de 1 a 35
        int counter = 1;
        
        while( counter <= 35){
            System.out.println(counter);
            counter++;
        }

           //EJERCICIO 4: cuenta regresiva para ano nuevo
           
           System.out.println("Cuenta regresiva ano nuevo");
           int counter = 10;
           
           while( counter <= 10  && counter >= 0){
               System.out.println(counter);
               counter--;
           }
    }
    
}
