/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    int[] num = new int[10];
    
    for (int i=0 ; i < 10; i++) {
    
      System.out.printf("\nIntroduzca un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    
    }
    
    System.out.printf("\n");
    
    for (int i=9 ; i > -1; i--) {
    
      System.out.printf(" %s",num[i]);
    
    }
    
  }
}
