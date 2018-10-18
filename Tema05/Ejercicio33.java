/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio33 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int base=altura-2;
    int espacios=altura-2;

    for (int i = altura-1; i != 0; i--) {
      
        System.out.printf("\n*");
        
      
          
        for (int c = espacios ; c !=0; c--) {
        
          System.out.printf(" ");
          
        }
        
        
        System.out.printf("*");
        
        
        if (i == 1) {
        
          base = altura - 2;
          System.out.println("");
          System.out.printf(" ");
          
          for (int j = 0; j != base; j++) {
          
            System.out.printf("*");
          }
        }
      }
  }
}
