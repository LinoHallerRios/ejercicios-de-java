/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    
    int num;
    int i=0;
    while (i <= 100) {
    
      num = i % 5;
      
      if(num == 0) {
        System.out.printf("\n%d",i);
      }
    
      i++;
    }

  
  
  }
}
