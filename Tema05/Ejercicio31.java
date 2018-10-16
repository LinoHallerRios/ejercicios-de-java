/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio31 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());
    

    for (int i = altura; i != 0; i--) {
      
        System.out.printf("\n*");
        
        if (i == 1) {
        
          int base = (int)(altura/2);
          
          for (int j = 0; j != base; j++)
          System.out.printf("*");
        
        }
        
    }

  }
}
