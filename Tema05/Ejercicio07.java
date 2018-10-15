/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int key = 0;
    int fallos = 0;
    int aux = 3;
    String combinacion;
  
    while (fallos < 4) {
      
      System.out.printf("\n\nIntroduzca la combinación de la caja fuerte: ");
      combinacion = System.console().readLine();
      key = Integer.parseInt(combinacion);
      
      if (key == 1234) {
      
        System.out.printf("\nLa caja fuerte se ha abierto satisfactoriamente.");
        fallos = 4;
      }
      
      if (key != 1234) {
      
        System.out.printf("\nLo siento, esa no es la combinación.");
        System.out.printf("\nQuedan %d intentos.",aux);
        fallos++;
        aux--;
      
      } 
    
    }

  }
}
