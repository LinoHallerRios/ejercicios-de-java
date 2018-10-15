/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    int num;
    int i=1;
    
     do {
    
      num = i % 5;
      
      if(num == 0) {
        System.out.printf("\n%d",i);
      }
    
      i++;
    

   }while(i <= 100);
  
  }
}
