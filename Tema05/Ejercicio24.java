/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio24 {

  public static void main(String[] args) {
  
    System.out.print("Introduzca la altura de una pirámide: ");
    int alturaScan = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int espacios = alturaScan - 1;
    int num;
    
    while (altura <= alturaScan) {
      

      for (num = 1; num <= espacios; num++) {
        System.out.print(" ");
      }

      for ( num = 1; num < altura; num++) {
        System.out.print(num);
      }
      
      for (num = altura; num > 0; num--) {
        System.out.print(num);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      
    } 

  }
}
