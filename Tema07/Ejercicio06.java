/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
    int[] num = new int[30];
    int[] num2 = new int[30];
    int num3=0;
    
    for (int i=0 ; i < 15; i++) {
    
      System.out.printf("\nIntroduzca un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
      
      num2[i + 1] = num[i];
      
      if (i == 14) {
      
        num3 = num[i];
      
      }
    
    }
    
    System.out.printf("\n");
    
    System.out.printf("%d",num3);
    
    for (int i=0 ; i < 14; i++) {
    
      System.out.printf(" %s", num[i]);
    
    }

    
  }
}
