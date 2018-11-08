/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    
    int[] num = new int[10];
    
    for (int i=0 ; i < 10; i++) {
    
      System.out.printf("\nIntroduzca un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    
    }
    
    int maximo = num[0];
    int minimo = num[0];
    
    System.out.printf("\n");
    
    for (int i=0 ; i < 10; i++) {
    
      if (num[i] < minimo) {
      
        minimo = num[i];
      
      }
      
      if (num[i] > maximo) {
      
        maximo = num[i];
      
      }
    
    }
    
    for (int i=0 ; i < 10; i++) {
    
      if (num[i] == minimo) {
      
        System.out.printf("\n%s mínimo",num[i]);
      
      }
      
      if (num[i] == maximo) {
      
        System.out.printf("\n%s máximo",num[i]);
      
      }
      
      if (num[i] != minimo && num[i] != maximo) {
      
        System.out.printf("\n%s",num[i]);
      
      }
    
    }
    
    
  }
}
