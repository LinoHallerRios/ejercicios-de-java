/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    System.out.printf("\n");
    
    for (int i=0 ; i < 10; i++) {
    
      System.out.printf(" %s",simbolo[i]);
    
    }
    
  }
}
