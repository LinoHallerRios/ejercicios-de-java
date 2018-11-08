/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    
    int[] num = new int[100];
    int[] num2 = new int[100];
    int numero=0;
    int numero2=0;
    
    for (int i=0;i < 100;i++) {
    
      num[i] = (int)((Math.random() * 21));
      System.out.printf(" %d",num[i]);
    
    }

    System.out.printf("\n");

    System.out.printf("\nIntroduce un número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.printf("\nIntroduce otro número: ");
    numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.printf("\n");
    
    for (int i=0;i < 100;i++) {
    
      num2[i] = num[i];
      
      if (num[i] == numero) {
      
        num2[i] = numero2;
      
      }
      
    
    }
    
    for (int i=0;i < 100;i++) {
      
      if (num[i] == numero) {
      
        System.out.printf(" '%d'",num2[i]);
        
      } else {
      
        System.out.printf(" %d",num2[i]);
      
      }
    
      
    
    }
    
  }
}
