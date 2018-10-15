/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio22 {

  public static void main(String[] args) {
    
    System.out.printf(" \nLos números primos del 2 al 100 son: \n");

    int cont = 0;

    for (int i = 2; i <= 100; i++) {

      cont = 1;
      
      for (int j = 2; j < i; j++) {
        
        if (i % j == 0) {
          cont = 0;
        }
        
      }

      if (cont == 1) {
        
        System.out.printf(" \n%d",i);
        
      }
    }

  }
}
