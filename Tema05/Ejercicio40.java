/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio40 {

  public static void main(String[] args) {
    
    System.out.printf("\nIntroduzca la altura del rombo: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int espaciosIz = altura / 2;
    int espaciosCen = -1;
    
    System.out.println("");
    
    if ((altura >= 3) && (altura % 2 == 1)) {
      
      for (int i = 0; i < altura; i++) {
      
        for (int e=0; e < espaciosIz;e++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        
        for (int e=0 ; e < espaciosCen; e++) {
          System.out.print(" ");
        }
        
        
        if ((i > 0) && (i < altura - 1)) {
          System.out.print("*");
        }
        
        System.out.println("");
        
        if (i < (altura/2)) {
          espaciosIz--;
          espaciosCen+=2;
        } else {
          espaciosIz++;
          espaciosCen-=2;
        }
          
      }

    } else {
    
      System.out.printf("\nLa altura introducida no es valida, debe ser un número impar >= 3");
    
    }
  
  }
}
