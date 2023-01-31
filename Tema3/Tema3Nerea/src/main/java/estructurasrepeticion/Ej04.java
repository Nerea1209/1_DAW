/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepeticion;

/**
 *
 * @author nerea
 */
public class Ej04 {
    public static void main(String[] args) {
        /*Antes de ejecutar: Imprime 10 veces "Número: (del 1 al 10)"
        Y termina porque numero es 1, ya que la variable en while no se guarda
        en el resto del código
        EJECUCIÓN: Imprime del 1 al 10 y del 10 al 1, por lo tanto,
        La variable cuando se inicializa dentro del bucle, no está en el resto
        del código, pero si se inicializa fuera y se modifica en el while,
        se guarda el valor independientemente de estar dentro o fuera del
        bucle*/
        
          int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
   	  }

    
    
}
