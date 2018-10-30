/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
    int numIntroducido=0;
    int numCorrecto=0;
    int cont=0;
    String seguir;
    
    System.out.printf("\nIntenta adivinar el número del 0 al 100.");
    
    do {
    
      numCorrecto = (int)((Math.random() * 100));
    
      for (int i=0; i < 5; i++) {
    
        System.out.printf("\nIntroduce un número del 0 al 100: ");
        numIntroducido = Integer.parseInt(System.console().readLine());
      
        if (numIntroducido == numCorrecto) {
      
          System.out.printf("\nCorrecto! Has acertado.");
          break;
        }
      
        if (numIntroducido < numCorrecto && i != 4) {
      
          System.out.printf("\nIncorrecto.");
          System.out.printf("\nEl número es mayor al que has introducido.");
      
        }
      
        if (numIntroducido > numCorrecto && i != 4) {
      
          System.out.printf("\nIncorrecto.");
          System.out.printf("\nEl número es menor al que has introducido.");
      
        }
        
        if (numIntroducido != numCorrecto && i == 4) {
      
        System.out.printf("\n\nLo siento no lo has conseguido.");
        System.out.printf("\nEl número correcto era %d",numCorrecto);
      }
        
      }
      
      
      System.out.printf("\n\nQuieres volver a intentarlo (s/n): ");
      seguir = System.console().readLine();
      
    } while ((seguir.equals("s")) || (seguir.equals("S")));
    
  }
}
