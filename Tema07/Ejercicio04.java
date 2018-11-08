/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i=0 ; i < 20; i++) {
    
      num[i] = (int)((Math.random() * 101));
    
    }
    
    System.out.printf("\n");
    
    for (int i=0 ; i < 20; i++) {
    
      cuadrado[i] = (int)(Math.pow(num[i],2));
    
    }
    
    for (int i=0 ; i < 20; i++) {
    
      cubo[i] = (int)(Math.pow(num[i],3));
    
    }
    
    for (int i=0 ; i < 20; i++) {
    
      System.out.printf("\n%4s   %4s    %4s",num[i],cuadrado[i],cubo[i]);
    
    }
    
  }
}
